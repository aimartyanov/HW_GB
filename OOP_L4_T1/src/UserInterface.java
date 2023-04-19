import java.util.Scanner;

public class UserInterface {
    private final GenealogyTree<Person> tree;
    private final Scanner scanner;

    public UserInterface(GenealogyTree<Person> tree) {
        this.tree = tree;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Выберите команду:");
            System.out.println("1. Вывести всех членов семьи");
            System.out.println("2. Вывести детей человека");
            System.out.println("3. Выход");

            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    printAllFamilyMembers();
                    break;
                case 2:
                    printChildrenOfPerson();
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверная команда");
            }
        }
    }

    private void printAllFamilyMembers() {
        System.out.println("Все члены семьи:");
        for (Person person : tree) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + ", " + person.getBirthYear());
        }
    }

    private void printChildrenOfPerson() {
        System.out.println("Введите имя и фамилию человека:");
        String firstName = scanner.next();
        String lastName = scanner.next();

        // Для поиска человека можно реализовать отдельный метод или использовать итератор
        Person targetPerson = null;
        for (Person person : tree) {
            if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
                targetPerson = person;
                break;
            }
        }

        if (targetPerson == null) {
            System.out.println("Человек не найден");
        } else {
            System.out.println("Дети " + firstName + " " + lastName + ":");
            for (Person child : targetPerson.getChildren()) {
                System.out.println(child.getFirstName() + " " + child.getLastName());
            }
        }
    }
}
