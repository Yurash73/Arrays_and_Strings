import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String[] arrayOfStrings = new String[10];
        int[] arrayOfInt = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку: ");
            arrayOfStrings[i] = scanner.nextLine();
            arrayOfInt[i] = arrayOfStrings[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayOfStrings[i] + " - длина: "
                    + arrayOfInt[i] + " символов.");
        }


    }
}
