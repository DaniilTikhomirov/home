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
        if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if(os == 0 && clientDeviceYear < 2015) {
            System.out.println("становите облегченную версию приложения для iOS по ссылке");
        }
        if (os == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(os == 1 && clientDeviceYear > 2015) {
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
        byte monthNumber = cin.nextByte();
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
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