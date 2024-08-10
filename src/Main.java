import java.util.Scanner;

public class Main {
    static Scanner cin = new Scanner(System.in);
    public static void task1(){
        System.out.println("напишите ваш возраст");
        int age = cin.nextInt();
        if (age >= 18){
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("тебе нет 18");
        }


    }
    public static void main(String[] args) {
        task1();

    }
}