import java.io.IOException;

public interface FileIO
{
    void save(FamilyTree familyTree, String fileName) throws IOException;

    FamilyTree load(String fileName) throws IOException, ClassNotFoundException;
}
