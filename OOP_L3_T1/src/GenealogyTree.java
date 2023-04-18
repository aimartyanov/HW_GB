import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class GenealogyTree implements Iterable<Person>, Serializable
{
    private Person root;

    public GenealogyTree(Person root)
    {
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
    public Iterator<Person> iterator() {
        return new Iterator<Person>() {
            private Queue<Person> queue = new ArrayDeque<>(Collections.singletonList(root));

            @Override
            public boolean hasNext() {
                return !queue.isEmpty();
            }

            @Override
            public Person next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Person current = queue.poll();
                queue.addAll(current.getChildren());
                return current;
            }
        };
    }

    }

