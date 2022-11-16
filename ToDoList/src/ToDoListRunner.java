import java.util.Scanner;

public class ToDoListRunner {

    public static void main(String[] args) {
        System.out.println("Witaj w Liście do zrobienia.");
        System.out.println("Wprowadź operację w formacie: operacja;nazwa;deadline;priorytet.");
        System.out.println("Jeżeli chcesz zakończyć program wpisz: koniec.");

        ToDoList ToDoList = new ToDoList();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String command = scanner.nextLine();

            if (command.equals("koniec")) {
            break;
        }

            String[] split = command.split(";");
            String operation = split[0];
            switch (operation) {
                case "new" -> ToDoList.add(split);
                case "edit" -> ToDoList.edit(split);
                case "delete" -> ToDoList.delete(split[1]);
                case "read_all" -> ToDoList.readAll();
                case "deadline_count" -> ToDoList.deadlineCount();
            }
        }
    }
}
