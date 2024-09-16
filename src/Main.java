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

    public static void task3() {
        short allStudent = 23 + 27 + 30;
        short paper = 480;
        int paperPerStudent = paper / allStudent;

        System.out.println("бумаги на ученика " + paperPerStudent);
    }

    public static void task4() {
        byte bottlePerMinute = 16 / 2;
        int bottlePer20Minute = bottlePerMinute * 20;
        int bottlePerDay = bottlePer20Minute * 3 * 24;
        int bottlePer3Days = bottlePerDay * 3;
        int bottlePerMouth = bottlePer3Days * 10;

        System.out.println("бутылок за 20 минут " + bottlePer20Minute + "\nбутылок за день " + bottlePerDay
                + "\nбутылок за 3 дня " + bottlePer3Days + "\nбутылок за месяц " + bottlePerMouth);
    }

    public static void task5() {
        byte color = 120;
        byte classRoom = (byte) (color / (2 + 4));
        byte brownColor = (byte) (classRoom * 4);
        byte whiteColor = (byte) (classRoom * 2);

        System.out.println("коричневой краски - " + brownColor + "\nбелой краски - " + whiteColor);

    }

    public static void task6() {
        short banana = 80 * 5;
        short milk = 105 * 2;
        short iceCream = 100 * 2;
        short egg = 70 * 4;

        short totalWeightGr = (short) (banana + milk + iceCream + egg);
        float totalWeightKg = (float) totalWeightGr / 1000;

        System.out.printf("вес завтрака %sкг%n", totalWeightKg);

    }

    public static void task7() {
       short task = 7 * 1000;
       short _250gr = (short) (task / 250);
       short _500gr = (short) (task / 500);

       System.out.printf("- 250гр %s дней\n- 500гр %s дней%n", _250gr, _500gr);

    }

    public static void task8() {
        float MashaPerMouth = 67_760;
        float DenisPerMouth = 83_690;
        float KristinaPerMouth = 76_230;

        float MashaPerYear = MashaPerMouth * 12;
        float DenisPerYear = DenisPerMouth * 12;
        float KristinaPerYear = KristinaPerMouth * 12;

        MashaPerMouth = (float) (MashaPerMouth * 1.01);
        DenisPerMouth = (float) (DenisPerMouth * 1.01);
        KristinaPerMouth = (float) (KristinaPerMouth * 1.01);

        float differenceMashaPerYear = (MashaPerMouth * 12) - MashaPerYear;
        float differenceDenisPerYear = (DenisPerMouth * 12) - DenisPerYear;
        float differenceKristinaPerYear = (KristinaPerMouth * 12) - KristinaPerYear;

        System.out.printf("Маша теперь получает %s рублей. Годовой доход вырос на %s рублей", MashaPerMouth,
                differenceMashaPerYear);
        System.out.printf("\nДенис теперь получает %s рублей. Годовой доход вырос на %s рублей", DenisPerMouth,
                differenceDenisPerYear);
        System.out.printf("\nКристина теперь получает %s рублей. Годовой доход вырос на %s рублей", KristinaPerMouth,
                differenceKristinaPerYear);




    }

    public static void main(String[] args) {
        task1();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task2();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task3();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task4();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task5();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task6();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task7();
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        task8();

    }
}