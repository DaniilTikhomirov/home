class Main {
    public static void task1() {
        float fNum = 2.2F;
        double dNum = 2.234667678555;
        byte bNum = 127;
        short sNum = 32767;
        int iNum = 32767;
        long lNum = 9223372036854775807L;

        System.out.println("Значение переменной fNum с типом float равно " + fNum);
        System.out.println("Значение переменной dNum с типом double равно " + dNum);
        System.out.println("Значение переменной bNum с типом byte равно " + bNum);
        System.out.println("Значение переменной sNum с типом short равно " + sNum);
        System.out.println("Значение переменной iNum с типом int равно " + iNum);
        System.out.println("Значение переменной lNum с типом long равно " + lNum);
    }

    public static void task2() {
        float fNum = 27.12F;
        long lNum = 987678965549L;
        double dNum = 2.786;
        short sNum = 569;
        int iNum = -159;
        short sNum2 = 27897;
        byte bNum = 67;

        System.out.println("fNum = " + fNum + "\nlNum = " + lNum + "\ndNum = " + dNum + "\nsNum" + sNum +
                "\niNum = " + iNum + "\nsNum2 = " + sNum2 + "\nbNum = " + bNum);
    }

    public static void main(String[] args) {
        task1();
        task2();
    }
}