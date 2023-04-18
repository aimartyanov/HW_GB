import java.util.List;
import java.io.IOException;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person parent1 = new Person("Иван", "Иванов", 1960);
        Person parent2 = new Person("Мария", "Иванова", 1965);
        Person child1 = new Person("Алексей", "Иванов", 1990);
        Person child2 = new Person("Ольга", "Иванова", 1995);

        parent1.addChild(child1);
        parent1.addChild(child2);
        parent2.addChild(child1);
        parent2.addChild(child2);
        child1.setFather(parent1);
        child1.setMother(parent2);
        child2.setFather(parent1);
        child2.setMother(parent2);

        GenealogyTree tree = new GenealogyTree(parent1);

        System.out.println("Дети Ивана Иванова: ");
        for (Person child : tree.getChildren(parent1)) {
            System.out.println(child.getFirstName() + " " + child.getLastName());
        }
    }
}


