import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTreeImpl implements FamilyTree, Iterable<Person>
{
    private List<Person> persons;

    public FamilyTreeImpl()
    {
        persons = new ArrayList<>();
    }

    @Override
    public void addPerson(Person person)
    {

    }

    @Override
    public void addChild(Person parent, Person child)
    {

    }

    @Override
    public List<Person> getAllChildren(Person parent)
    {
        return null;
    }

    @Override
    public void sortByName()
    {

    }

    @Override
    public void sortByBirthDate()
    {

    }

    @Override
    public Iterator<Person> iterator()
    {
        return null;
    }

    // реализация методов интерфейса FamilyTree и Iterable

}
