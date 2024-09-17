public class Main {
    public static void task1() {
        final int DEPOSIT = 15_000;
        final int TARGET = 2_459_000;
        int value = 0;
        int mouth = 1;
        while (value <= TARGET) {
            value = (int) (DEPOSIT + (value * 1.12));
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей до цели осталось %d\n",
                    mouth, value, TARGET - value);
            mouth++;

        }
    }

    public static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i --;
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int population = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            population += 9 * (population / 1000);
            System.out.printf("Год %d, численность населения составляет %d\n", i, population);
        }
    }

    public static void task4() {
        int value = 15_000;
        int mouth = 1;
        final int TARGET = 12_000_000;
        while (value <= TARGET) {
            value += (int) (value * 0.07F);
            System.out.println(value + " " + mouth);
            mouth++;
        }
    }

    public static void task5() {
        int value = 15_000;
        int mouth = 1;
        final int TARGET = 12_000_000;
        byte counter = 1;
        while (value <= TARGET) {
            value += (int) (value * 0.07F);
            if (counter == 6){
                System.out.println(value + " " + mouth);
                counter = 0;
            }
            mouth++;
            counter++;
        }
    }

    public static void task6() {
        int deposit = 15_000;
        for (int i = 1; i != 12 * 9; i++){
            deposit += (int) (deposit * 0.07F);
            if (i % 6 == 0){
                System.out.println(deposit);
            }
        }
    }

    public static void task7() {
        int friday = 1;
        for (int i = friday; i <= 31; i += 7) {
            System.out.println("сегодня пятница!");
        }
    }

    public static void task8() {
        final int YEAR = 2024;
        for (int i = 1580; i <= YEAR + 100; i += 79){
            if (i >= (2024 - 200)){
                System.out.println(i);
            }
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
    }
}