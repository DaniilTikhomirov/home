public class Main {
    public static void main(String[] args) {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        fullName = fullName.replace("ё", "е");
        System.out.printf("Ф. И. О. сотрудника — %s\n", fullName);
        String upFullName = fullName.toUpperCase();
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s", upFullName);
    }
}