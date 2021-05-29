public class Time {
    public static void main(String[] args) {
        int second = 454515546;
        int day = second /86400;
        int hours = (second % 86400) /3600;
        int minutes = ((second % 86400) %3600) /60;
        int leftSeconds = second - (day* 86400) - (hours*3600) - (minutes*60);
        System.out.println("Общее количество секунд:  " + second);
        System.out.println("Дней: " + day);
        System.out.println(("Часов: " + hours));
        System.out.println("Минут: " + minutes);
        System.out.println("Оставшихся секунд: " + leftSeconds);

    }
}
