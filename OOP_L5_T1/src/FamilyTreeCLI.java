import java.util.List;
import java.util.Scanner;

public abstract class FamilyTreeCLI implements FamilyTreeView
{
    private final FamilyTreePresenter presenter;
    private final Scanner scanner;

    public FamilyTreeCLI(FamilyTreePresenter presenter)
    {
        this.presenter = presenter;
        this.scanner = new Scanner(System.in);
    }

    public void start()
    {
        boolean isRunning = true;
        while (isRunning)
        {
            System.out.println("Выберите команду:");
            System.out.println("1. Вывести всех членов семьи");
            System.out.println("2. Вывести детей человека");
            System.out.println("3. Выход");

            int command = scanner.nextInt();
            switch (command)
            {
                case 1:
                    presenter.displayAllFamilyMembers();
                    break;
                case 2:
                    System.out.println("Введите имя и фамилию человека:");
                    String firstName = scanner.next();
                    String lastName = scanner.next();
                    presenter.displayChildrenOfPerson(firstName, lastName);
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    displayInvalidCommand();
            }
        }
    }

    @Override
    public void displayFamilyMembers(List<Person> members)
    {
        System.out.println("Все члены семьи:");
        for (Person person : members)
        {
            System.out.println(person.getFirstName() + " " + person.getLastName() + ", " + person.getBirthYear());
        }
    }

    @Override
    public void displayChildren(List<Person> children)
    {
        System.out.println("Дети:");
        for (Person child : children)
        {
            System.out.println(child);
        }
    }


}
