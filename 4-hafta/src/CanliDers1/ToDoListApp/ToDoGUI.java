package CanliDers1.ToDoListApp;

import java.util.List;
import java.util.Scanner;

public class ToDoGUI {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ToDoService toDoService = new ToDoService();

    public static void main(String[] args) {

        System.out.println("Yapılacak işler listeleme uygulamasına hoş geldiniz");

        boolean running = true;
        int choice;

        do {

            printMenu();

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addToDo();
                    break;
                case 2:
                    completeToDo();
                    break;
                case 3:
                    listAllToDo();
                    break;
                case 4:
                    listCompletedToDos();
                    break;
                case 5:
                    listIncompleteToDosSortedByPriority();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Geçersiz Seçenek.");
            }

        } while(running);

    }

    private static void listIncompleteToDosSortedByPriority() {
        List<ToDo> inCompleteTodosSorted = toDoService.getInCompleteToDosSortedByPriority();
        for (ToDo inCompleteToDo : inCompleteTodosSorted) {
            System.out.println(inCompleteToDo);
        }
    }

    private static void listCompletedToDos() {
        List<ToDo> completedToDos = toDoService.getCompleted();
        for (ToDo completedToDo : completedToDos) {
            System.out.println(completedToDo);
        }
    }

    private static void listAllToDo() {
        List<ToDo> allToDos = toDoService.getAll();
        for (ToDo toDo : allToDos) {
            System.out.println(toDo);
        }
    }

    private static void completeToDo() {
        System.out.println("Lütfen tamamlamak istediğiniz işin id değerini giriniz:");
        int toDoId = scanner.nextInt();
        scanner.nextLine();
        toDoService.completeToDoItem(toDoId);
    }

    private static void addToDo() {
        System.out.println("Lütfen iş tanımı giriniz:");
        String description = scanner.nextLine();
        System.out.println("Lütfen işin önceliğini giriniz:");
        int priority = scanner.nextInt();
        toDoService.addTodoItem(description, priority);
        scanner.nextLine();
    }

    private static void printMenu() {

        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1.Yeni iş ekle");
        System.out.println("2.Mevcut İşi Tamamla");
        System.out.println("3.Tüm işleri listele");
        System.out.println("4.Tamamlanmış işleri listele");
        System.out.println("5.İşleri Öncelik Sırasına Göre Listele");
        System.out.println("6.Çıkış");

    }


}
