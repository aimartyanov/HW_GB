import java.util.List;

public interface FamilyTree
{
    void addPerson(Person person);

    void addChild(Person parent, Person child);

    List<Person> getAllChildren(Person parent);

    void sortByName();

    void sortByBirthDate();
}
