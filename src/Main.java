import java.util.Arrays;

public class Main {
    public static void task() {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        float[] b = {1.57F, 7.654F, 9.986F};
        String[] c = {"a", "b", "c"};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i < b.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i < c.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();


        for (int j : a) {
            System.out.println(j);
        }
        for (float v : b) {
            System.out.println(v);
        }
        for (String s : c) {
            System.out.println(s);
        }
        for (int i = a.length; i >= 1; i--) {
            System.out.println(a[i - 1]);
        }
        for (int i = b.length; i >= 1; i--) {
            System.out.println(b[i - 1]);
        }
        for (int i = c.length; i >= 1; i--) {
            System.out.println(c[i - 1]);
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0){
                a[i] += 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        task();
    }
}