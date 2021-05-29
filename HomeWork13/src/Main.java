public class Main {
    public static void main(String[] args) {
        employee employee1 = new employee("Степан", "CEO", 415613);
        String info = employee1.info(3);
        System.out.println(info);
    }
}
