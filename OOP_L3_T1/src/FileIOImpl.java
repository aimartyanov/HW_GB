import java.io.IOException;

public class FileIOImpl implements FileIO
{

    @Override
    public void save(FamilyTree familyTree, String fileName) throws IOException
    {
        // Реализация сохранения данных в файл
    }

    @Override
    public FamilyTree load(String fileName) throws IOException, ClassNotFoundException
    {
        // Реализация чтения данных из файла
        return null;
    }

    public void save(FileIO fileIO, String fileName) throws IOException
    {
        fileIO.save((FamilyTree) this, fileName);
    }
}
