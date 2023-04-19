import java.util.List;

public interface FamilyTreeView
{
    void displayFamilyMembers(List<Person> members);

    void displayChildren(List<Person> children);

    void displayPersonNotFound();

    void displayInvalidCommand();
}
