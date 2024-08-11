import java.util.Scanner;

public class Main {
    public Scanner cin = new Scanner(System.in);

    public static void task1() {
        for (int i = 1; i <= 10; i ++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        for (int i = 10; i >= 0; i --){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        for (int i = 0; i <= 17; i = i + 2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4() {
        for (int i = 10; i >= -10; i --){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task5() {
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.printf("%d год является високосным\n", i);
        }
    }

    public static void task6() {
        for (int i = 7; i <= 98; i = i + 7){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        for (int i = 1; i <= 512; i = i * 2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        int deposit = 29_000;
        int value = 0;
        for (int i = 1; i <= 12; i ++){
            value += deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, value);
        }
    }

    public static void task9() {
        int deposit = 29_000;
        float value = 0;
        for (int i = 1; i <= 12; i ++){
            value += deposit;
            value *= 1.01F;
            System.out.printf("Месяц %d, сумма накоплений равна %s рублей\n", i, value);
        }
    }

    public static void task10() {
        for (int i = 1; i <= 10; i ++){
            System.out.printf("2 * %d = %d\n", i, i * 2);
        }

    }

    public static void main(String[] args) {
        task1();
        System.out.println("----");
        task2();
        System.out.println("----");
        task3();
        System.out.println("----");
        task4();
        System.out.println("----");
        task5();
        System.out.println("----");
        task6();
        System.out.println("----");
        task7();
        System.out.println("----");
        task8();
        System.out.println("----");
        task9();
        System.out.println("----");
        task10();
    }
}