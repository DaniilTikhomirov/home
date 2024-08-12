public class Main {
    public static void main(String[] args) {
        String firstName = "Иван";
        String middleName = "Ивановичь";
        String lastName = "Иванов";
        String fullName = lastName + firstName + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.printf("Ф. И. О. сотрудника — %s\n", fullName);
        String upFullName = fullName.toUpperCase();
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s", upFullName);
    }
}