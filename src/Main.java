public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author("Aleksndr", "Pushkin");
        Author Gogol = new Author("Nikolai", "Gogol");
        Book Poltava = new Book(Pushkin, "Poltva", 1829);
        Book DeadSoul = new Book(Gogol, "Dead soul", 1840);
        System.out.println("Pushkin name = " + Pushkin.getName());
        System.out.println("Pushkin last name = " + Pushkin.getLastName());
        System.out.println("Gogol name = " + Gogol.getName());
        System.out.println("Gogol last name = " + Gogol.getLastName());
        System.out.println("Poltava nameBook = " + Poltava.getNameBook());
        System.out.println("Poltava Author = " + Poltava.getAuthor().getName() + " " + Poltava.getAuthor().getLastName());
        System.out.println("Poltava year book = " + Poltava.getYearBook());
        System.out.println("Dead soul nameBook = " + DeadSoul.getNameBook());
        System.out.println("Dead soul Author = " + DeadSoul.getAuthor().getName() + " " + DeadSoul.getAuthor().getLastName());
        System.out.println("Dead soul year book = " + DeadSoul.getYearBook());

        DeadSoul.setYearBook(1842);
        System.out.println("Dead soul year book = " + DeadSoul.getYearBook());
        System.out.println(DeadSoul.toString());
        System.out.println(Pushkin.toString());
        System.out.println(Pushkin.equals(Gogol));
        System.out.println(DeadSoul.equals(Poltava));

    }
}