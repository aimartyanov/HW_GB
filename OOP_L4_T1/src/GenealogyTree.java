import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class GenealogyTree<T> implements Iterable<T>, Serializable {
    private T root;

    public GenealogyTree(T root) {
        this.root = root;
    }


        public List<Person> getChildren(Person person)
        {
            return person.getChildren();
        }
        public void save(GenealogyTreeIO treeIO, String fileName) throws IOException
        {
            treeIO.save(this, fileName);
        }

        public static GenealogyTree load(GenealogyTreeIO treeIO, String fileName) throws IOException {
            return treeIO.load(fileName);
        }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>()
        {
            private Queue<Person> queue = (Queue<Person>) new ArrayDeque<>(Collections.singletonList(root));

            @Override
            public boolean hasNext() {
                return !queue.isEmpty();
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Person current = queue.poll();
                queue.addAll(current.getChildren());
                return (T) current;
            }
        };
    }

    }

