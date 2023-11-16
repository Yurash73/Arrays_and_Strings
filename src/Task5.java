import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int bigArray[] = new int[20];
        int firstSmall[] = new int[10];
        int secondSmall[] = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < bigArray.length; i++) {
            System.out.println("Введите целое число (осталось "
                    + (20 - i) + ") :");
            bigArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            firstSmall[i] = bigArray[i];
            secondSmall[i] = bigArray[10 + i];
            System.out.println(secondSmall[i]);
        }

    }
}
