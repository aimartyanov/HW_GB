import java.io.IOException;

public interface GenealogyTreeIO
{
    void save(GenealogyTree tree, String fileName) throws IOException;

    GenealogyTree load(String fileName) throws IOException;
}
