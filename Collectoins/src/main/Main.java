package main;

public class Main {
    public static void main(String[] args) {

        MyArrayList employees = new MyArrayList();
        employees.add("Никита");
        employees.add("Игорь");
        employees.add("Ваня");
        employees.add("Иван");
        employees.add("Максим");
        employees.add("Ирина");
        employees.add("Алексей");
        employees.remove("Ваня");
        employees.remove("Алексей");
        employees.remove("Семен");
        System.out.println(employees.showArray());

    }

}
