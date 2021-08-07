public class MyCounter implements Counter{

    @Override
    public String Order(int countMonths) {
        return "Отчет за " + countMonths + " месяцев.";
    }
}
