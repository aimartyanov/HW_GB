import java.util.ArrayList;
import java.util.List;

public class FamilyTreePresenter {
    private final FamilyTreeView view;
    private final GenealogyTree<Person> tree;

    public FamilyTreePresenter(FamilyTreeView view, GenealogyTree<Person> tree) {
        this.view = view;
        this.tree = tree;
    }

    public void displayAllFamilyMembers() {
        List<Person> members = new ArrayList<>();
        for (Person person : tree) {
            members.add(person);
        }
        view.displayFamilyMembers(members);
    }

    public void displayChildrenOfPerson(String firstName, String lastName) {
        Person targetPerson = null;
        for (Person person : tree) {
            if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
                targetPerson = person;
                break;
            }
        }

        if (targetPerson == null) {
            view.displayPersonNotFound();
        } else {
            view.displayChildren(new ArrayList<>(targetPerson.getChildren()));
        }
    }
}
