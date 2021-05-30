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
        for (int i =0; i< employees.getSize(); i++){
            System.out.println(employees.get(i));
        }
    }

}
