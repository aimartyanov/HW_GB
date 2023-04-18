import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable

    {
        private String firstName;
        private String lastName;
        private int birthYear;
        private Person mother;
        private Person father;
        private List<Person> children;

    public Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.children = new ArrayList<>();
    }

        // Геттеры и сеттеры для полей класса
        public String getFirstName () {
        return firstName;
    }

        public String getLastName () {
        return lastName;
    }

        public int getBirthYear () {
        return birthYear;
    }

        public Person getMother () {
        return mother;
    }

        public void setMother (Person mother){
        this.mother = mother;
    }

        public Person getFather () {
        return father;
    }

        public void setFather (Person father){
        this.father = father;
    }

        public List<Person> getChildren () {
        return children;
    }

        public void addChild (Person child){
        this.children.add(child);
    }
    }
