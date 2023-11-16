import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String[] arrayOfStrings = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Введите строку:");
            arrayOfStrings[i] = scanner.nextLine();
        }
        System.out.println("\nПечатаем массив в обратоном порядке: ");

        for (int i = 9; i >= 0; i--) {
            System.out.println(arrayOfStrings [i]);
        }

    }
}
