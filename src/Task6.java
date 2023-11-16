import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int arrayOfInt[] = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.println("Введите целое число (осталось "
                    + (20 - i) + ") :");
            arrayOfInt[i] = scanner.nextInt();
        }

        int max = arrayOfInt[0];
        int min = arrayOfInt[0];

        for (int i = 1; i < 20; i++) {
            if (arrayOfInt[i] > max) max = arrayOfInt[i];
            if (arrayOfInt[i] < min) min = arrayOfInt[i];
        }

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

    }
}
