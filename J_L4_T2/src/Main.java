import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        // добавляем элементы в очередь
        queue.enqueue("Первый");
        queue.enqueue("Второй");
        queue.enqueue("Третий");

        // выводим первый элемент
        System.out.println("Первый элемент в очереди: " + queue.first());

        // удаляем первый элемент из очереди и выводим его
        System.out.println("Удаленный элемент: " + queue.dequeue());

        // выводим первый элемент после удаления
        System.out.println("Первый элемент в очереди: " + queue.first());
    }
}

class Queue<T> {
    private final LinkedList<T> list = new LinkedList<>();

    // Метод enqueue() помещает элемент в конец очереди
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Метод dequeue() возвращает первый элемент из очереди и удаляет его
    public T dequeue() {
        return list.pollFirst();
    }

    // Метод first() возвращает первый элемент из очереди, не удаляя
    public T first() {
        return list.getFirst();
    }

    // Метод isEmpty() возвращает true, если очередь пуста, и false в противном случае

}
