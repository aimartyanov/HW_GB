import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class GenealogyTree implements Serializable
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
    }

