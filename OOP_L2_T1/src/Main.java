import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

class Person {
    interface FamilyTreeFileIO {
        void save(FamilyTree familyTree, String filename) throws IOException, ClassNotFoundException;
        FamilyTree load(String filename) throws IOException, ClassNotFoundException;
    }

    // Реализация интерфейса
    class FamilyTreeFileIOImpl implements FamilyTreeFileIO {
        @Override
        public void save(FamilyTree familyTree, String filename) throws IOException, ClassNotFoundException
        {
            try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(filename))) {
                oos.readObject();
            }
        }

        @Override
        public FamilyTree load(String filename) throws IOException, ClassNotFoundException {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
                return (FamilyTree) ois.readObject();
            }
        }
    }
    String name;
    int birthYear;
    Person parent1;
    Person parent2;
    List<Person> children;

    public Person(String name, int birthYear, Person parent1, Person parent2) {
        this.name = name;
        this.birthYear = birthYear;
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.children = new ArrayList<>();
    }

    public void addChild(Person child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return name + " (" + birthYear + ")";
    }
}

class FamilyTree {
    List<Person> people;

    public FamilyTree() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person findPerson(String name) {
        for (Person person : people) {
            if (person.name.equals(name)) {
                return person;
            }
        }
        return null;
    }
}

class Research {
    FamilyTree familyTree;

    public Research(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public List<Person> getChildren(String personName) {
        Person person = familyTree.findPerson(personName);
        if (person != null) {
            return person.children;
        } else {
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Person person1 = new Person("Алексей", 1970, null, null);
        Person person2 = new Person("Ирина", 1975, null, null);
        Person person3 = new Person("Михаил", 1999, person1, person2);
        Person person4 = new Person("Елена", 2001, person1, person2);

        person1.addChild(person3);
        person1.addChild(person4);
        person2.addChild(person3);
        person2.addChild(person4);

        familyTree.addPerson(person1);
        familyTree.addPerson(person2);
        familyTree.addPerson(person3);
        familyTree.addPerson(person4);

        Research research = new Research(familyTree);
        List<Person> children = research.getChildren("Алексей");
        System.out.println("Дети Алексея: " + children);
    }
}
