import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int[] arrayOfInt = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.println("Введите целое число (осталось "
                    + (20 - i) + ") :");
            arrayOfInt[i] = scanner.nextInt();
        }

        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayOfInt.length - 1; i++) {
                if (arrayOfInt[i] < arrayOfInt[i + 1]) {
                    isSorted = false;
                    buffer = arrayOfInt[i];
                    arrayOfInt[i] = arrayOfInt[i + 1];
                    arrayOfInt[i + 1] = buffer;
                }
            }
        }
        System.out.println("Вывод массива отсортированного по убыванию: ");
        for (int i = 0; i < arrayOfInt.length; i++)
            System.out.println(arrayOfInt[i]);
    }
}
