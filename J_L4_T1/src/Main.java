import java.util.LinkedList;

public class Main
{
    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<Integer>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        LinkedList<Integer> reversedList = reverse(list);

        System.out.println("Original list: " + list);
        System.out.println("Reversed list: " + reversedList);
    }
}
