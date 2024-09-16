import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static int maxElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int minElement(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static float averageElement(int[] array) {
        return (float) sumArray(array) / array.length;
    }

    public static void reverseArray(char[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            char first = array[i];
            char second = array[array.length - 1 - i];
            array[i] = second;
            array[array.length - 1 - i] = first;
        }
    }

    public static void reversePrint(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] money = new int[5];
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < money.length; i++) {
            money[i] = cin.nextInt();
        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", sumArray(money));
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей." +
                        " Максимальная сумма трат за неделю составила %s рублей\n",
                minElement(money), maxElement(money));
        System.out.printf("Средняя сумма трат за месяц составила %s рублей\n", averageElement(money));
        reversePrint(reverseFullName);

    }
}