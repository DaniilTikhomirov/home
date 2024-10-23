import java.util.Scanner;

public class Main {
    static Scanner cin = new Scanner(System.in);

    public static int task1(){
        System.out.println("напишите ваш возраст");
        int age = cin.nextInt();

        if (age >= 18){
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("тебе нет 18");
        }
        return age;
    }

    public static void task2(){
      System.out.println("сколько градусов на улице?");
      int temperature = cin.nextInt();

      if (temperature >= 5){
          System.out.println("Сегодня тепло, можно идти без шапки");
      } else {
          System.out.println("На улице холодно, нужно надеть шапку");
      }
    }

    public static void task3(){
        System.out.println("какая у вас скорость ?");
        int speed = cin.nextInt();

        if (speed > 60){
            System.out.println("скорость превышена");
        } else {
            System.out.println("Скорость не превышена");
        }
    }

    public static void task4(int age){
        if (2 <= age && age <= 6){
            System.out.println("нужно ходить в детский сад.");
        }
        if (7 <= age && age <= 17){
            System.out.println("нужно ходить в школу");
        }
        if (18 <= age && age <= 24){
            System.out.println("Нужно в универ");
        }
        if (age > 24){
            System.out.println("пора ходить на работу.");
        }
    }
    public static void task5(int age){
        if (age < 5){
            System.out.println("нельзя кататься на аттракционе");
        }
        if (age >= 5 && age <= 14){
            System.out.println("можно кататься на аттракционе в сопровождении");
        }
        if (age > 14){
            System.out.println("без сопровождения взрослого");
        }
    }
    public static void task6(){
        System.out.println("сколько человек в вагоне ?");
        int human = cin.nextInt();

        if (human > 102){
            System.out.println("мест нет");
        }
        if (human >= 60 && human < 102){
            System.out.println("Скорее всего сидячих мест нет");
        }
        if (human < 60){
            System.out.println("сидячие места есть");
        }
    }
    public static void task7(){
        System.out.println("напишите 3 числа");
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        if (a == c && b == c){
            System.out.println("они равны");
        }
        if (a > c && a > b){
            System.out.println("первое число самое наибольшие");
        }
        if (b > a && b > c){
            System.out.println("второе число наибольшие");
        }
        if (c > a && c > b){
            System.out.println("третье число наибольшие");
        }
    }
    public static void main(String[] args) {
        int age = task1();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task2();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task3();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task4(age);
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task5(age);
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task6();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task7();


    }
}