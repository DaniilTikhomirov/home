class Main {

    public static void main(String[] args) {
        /*
        первая задача
         */
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("first task");
        System.out.println("dog -> " + dog + "\ncat -> " + cat + "\npaper -> " + paper);
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        /*
        вторая задача
         */
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("second task");
        System.out.println("dog -> " + dog + "\ncat -> " + cat + "\npaper -> " + paper);
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        /*
        третия задача
         */
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper -  7639;

        System.out.println("third task");
        System.out.println("dog -> " + dog + "\ncat -> " + cat + "\npaper -> " + paper);
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        /*
        четвертая задача
         */
        System.out.println("fourth task");

        var friend = 19;

        System.out.println("friend -> " + friend);

        friend = friend + 2;

        System.out.println("friend -> " + friend);

        friend = friend / 7;

        System.out.println("friend -> " + friend);
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");

        /*
        пятая задача
         */
        var frog = 3.5;

        System.out.println("fifth task");
        System.out.println("frog -> " + frog);

        frog = frog * 10;

        System.out.println("frog -> " + frog);

        frog = frog / 3.5;

        System.out.println("frog -> " + frog);
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");

        /*
        шестая задача
         */
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        var differenceWeight = firstBoxer - secondBoxer;

        System.out.println("sixth task");
        System.out.println("totalWeight -> " + totalWeight + "\ndifferenceWeight -> " + differenceWeight);
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        /*
        седьмая задача
         */
        var remainderWeight = firstBoxer % secondBoxer;

        System.out.println("seventh task");
        System.out.println("remainderWeight -> " + remainderWeight);
        System.out.println("\u001B[32m" + "-".repeat(50) + "\u001B[0m");
        /*
        восьмая задача
         */
        var totalHour = 640;
        var workingDay = 8;
        var quantityWorker = totalHour / workingDay;

        System.out.println("eight task");
        System.out.println("Всего работников в компании " + quantityWorker + " человек");

    }

}