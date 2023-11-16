import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int[] arrayOfInt = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Введите целое число: ");
            arrayOfInt[i] = scanner.nextInt();
        }

        int max = arrayOfInt[0];

        for (int i = 1; i < 10; i++) {
            if (arrayOfInt[i] > max)
                max = arrayOfInt[i];
        }

        System.out.println("Max number in array: " + max);
    }
}
