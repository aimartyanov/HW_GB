import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows11", 90000, "Xiaomi"));
        set.add(new Notebook("Notebook 2", 16, "MacOs", 185000, "Apple"));
        set.add(new Notebook("Notebook 3", 32, "Ubuntu", 65000, "Asus"));
        set.add(new Notebook("Notebook 4", 64, "EndeavourOS", 50000, "HP"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}