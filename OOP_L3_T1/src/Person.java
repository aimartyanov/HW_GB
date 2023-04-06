import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person
{
    private String name;
    private LocalDate birthDate;
    private List<Person> children;

    public Person(String name, LocalDate birthDate)
    {
        this.name = name;
        this.birthDate = birthDate;
        this.children = new ArrayList<>();
    }

    // геттеры, сеттеры и другие методы
}
