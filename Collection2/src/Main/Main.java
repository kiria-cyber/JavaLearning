package Main;

public class Main {
    public static void main(String[] args) {
        ArrayList employees = new ArrayList();

        employees.add("Никита");
        employees.add("Игорь");
        employees.add("Ваня");
        employees.add("Иван");
        employees.add("Максим");
        employees.add("Ирина");
        employees.add("Алексей");
        employees.remove(2);
        employees.remove(4);
        employees.showArray();

    }
}
