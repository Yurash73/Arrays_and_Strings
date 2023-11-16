import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int[] arrayOfInt = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.println("Введите целое число: ");
            arrayOfInt[i] = scanner.nextInt();
        }

        System.out.println("Вывод массива в обратном порядке: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(arrayOfInt[i]);
        }
    }
}
