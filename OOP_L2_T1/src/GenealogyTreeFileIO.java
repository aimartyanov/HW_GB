import java.io.*;

public class GenealogyTreeFileIO implements GenealogyTreeIO
{
    @Override
    public void save(GenealogyTree tree, String fileName) throws IOException
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            oos.writeObject(tree);
        }
    }

    @Override
    public GenealogyTree load(String fileName) throws IOException
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName)))
        {
            return (GenealogyTree) ois.readObject();
        } catch (ClassNotFoundException e)
        {
            throw new IOException("Ошибка загрузки дерева", e);
        }
    }
}
