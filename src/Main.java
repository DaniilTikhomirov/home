import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);

    public static byte task1() {
        System.out.println("выберите ваше устройство 0 - IOS | 1 - Android");
        byte os = cin.nextByte();
        if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        return os;
    }

    public static void task2(byte os) {
        System.out.println("напишите год вашего телефона");
        short clientDeviceYear = cin.nextShort();
        if (clientDeviceYear < 2015) {
            if (os == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("становите облегченную версию приложения для iOS по ссылке");
            }
        } else if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("напишите год для проверки");
        short Year = cin.nextShort();
        if (Year > 1584) {
            if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
                System.out.println("високосный год");
            } else {
                System.out.println("не високосный год");
            }
        } else {
            System.out.println("не високосный год");
        }
    }

    public static void task4() {
        System.out.println("Напишите дистанцию");
        short distance = cin.nextShort();
        if (distance < 100) {
            byte days = 1;
            if (distance > 20) {
                days++;
            }
            if (distance > 60) {
                days++;
            }
            System.out.printf("доставка %s д.\n", days);
        } else {
            System.out.println("доставка не осуществляется");
        }
    }

    public static void task5() {
        System.out.println("напишите номер месяца");
        byte numMouth = cin.nextByte();
        if (1 <= numMouth && numMouth <= 12) {
            if (numMouth <= 2 || numMouth == 12) {
                System.out.println("Зима");
            } else if (numMouth <= 5) {
                System.out.println("Весна");
            } else if (numMouth <= 8) {
                System.out.println("Лето");
            } else {
                System.out.println("Осень");
            }
        }else {
            System.out.println("неверный месяц");
        }
    }

    public static void main(String[] args) {
        byte os = task1();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task2(os);
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task3();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task4();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task5();
    }
}