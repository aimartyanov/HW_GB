import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    private HashMap<String, List<String>> contacts;

    public Main() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public List<String> getPhoneNumbers(String name) {
        return contacts.get(name);
    }

    public static void main(String[] args) {
        Main phoneBook = new Main();

        phoneBook.addContact("John", "555-1234");
        phoneBook.addContact("Jane", "555-5678");
        phoneBook.addContact("John", "555-9876");

        System.out.println(phoneBook.getPhoneNumbers("John"));
        // Output: [555-1234, 555-9876]

        phoneBook.removeContact("Jane");

        System.out.println(phoneBook.getPhoneNumbers("Jane"));
        // Output: null
    }
}
