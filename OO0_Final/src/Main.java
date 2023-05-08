import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Note {
    String getTitle();
    String getContent();
}

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить заметку");
            System.out.println("2. Удалить заметку");
            System.out.println("3. Просмотреть все заметки");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Чтение пустой строки после ввода числа

            switch (choice) {
                case 1:
                    System.out.println("Введите заголовок заметки:");
                    String title = scanner.nextLine();
                    System.out.println("Введите содержимое заметки:");
                    String content = scanner.nextLine();
                    Note newNote = new SimpleNote(title, content);
                    notebook.addNote(newNote);
                    System.out.println("Заметка добавлена.");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Введите заголовок заметки для удаления:");
                    String noteTitle = scanner.nextLine();
                    Note noteToRemove = null;
                    for (Note note : notebook.getAllNotes()) {
                        if (note.getTitle().equals(noteTitle)) {
                            noteToRemove = note;
                            break;
                        }
                    }
                    if (noteToRemove != null) {
                        notebook.removeNote(noteToRemove);
                        System.out.println("Заметка удалена.");
                    } else {
                        System.out.println("Заметка с указанным заголовком не найдена.");
                    }
                    System.out.println();
                    break;
                case 3:
                    List<Note> allNotes = notebook.getAllNotes();
                    if (allNotes.isEmpty()) {
                        System.out.println("Блокнот пуст.");
                    } else {
                        System.out.println("Все заметки:");
                        for (Note note : allNotes) {
                            System.out.println("Заголовок: " + note.getTitle());
                            System.out.println("Содержимое: " + note.getContent());
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    System.out.println();
                    break;
            }
        }

        System.out.println("Работа приложения завершена.");
    }
}
