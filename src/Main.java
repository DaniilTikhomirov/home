public class Main {
    public static void task1() {
        int deposit = 15_000;
        int target = 2_459_000;
        int value = 0;
        int mouth = 1;
        while (value <= target) {
            value += deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей до цели осталось %d\n",
                    mouth, value, target - value);
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
        int target = 12_000_000;
        while (value <= target) {
            value += (int) (value * 0.07F);
            System.out.println(value + " " + mouth);
            mouth++;
        }
    }

    public static void task5() {
        int value = 15_000;
        int mouth = 1;
        int target = 12_000_000;
        byte counter = 1;
        while (value <= target) {
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
            System.out.println(i);
        }
    }

    public static void task8() {
         int Year = 2024;
         for (int i = 1580; i <= Year + 100; i += 79){
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