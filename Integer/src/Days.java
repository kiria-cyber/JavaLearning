public class Days {
    public static void main(String[] args) {
        int days = 365;
        int years = days/365;
        int month = (days % 365) / 31;
        int leftDays = days - (years*365) - (month*31);
        System.out.println("Общее количество дней:  " + days);
        System.out.println("Лет: " + years);
        System.out.println(("Месяцев: " + month));
        System.out.println("Дней: " + leftDays);
    }
}
