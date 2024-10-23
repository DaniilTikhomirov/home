import java.util.Scanner;

public class Main {
    public static boolean isLeap(short year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static void phoneApp(byte os, short year, short correctYear) {
        if (os == 1 && year < correctYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (os == 0 && year > correctYear) {
            System.out.println("становите облегченную версию приложения для iOS по ссылке");
        }
        if (os == 0 && year > correctYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (os == 1 && year > correctYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int deliveryTime(short distance) {
        if (distance < 20) {
            return 1;
        }
        if (distance > 100) {
            return 0;
        }
        if (distance > 60) {
            return 3;
        }
        return 2;

    }

    public static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        short year = cin.nextShort();
        if (isLeap(year)) {
            System.out.println("високосный год");
        } else {
            System.out.println("невисокосный год");
        }

        byte os = 1;
        phoneApp(os, year, (short) 2015);
        short distance = 40;
        System.out.println(deliveryTime(distance));
    }
}