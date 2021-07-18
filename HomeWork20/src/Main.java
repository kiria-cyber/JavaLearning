public class Main {
    public static void main(String[] args) {
        String s = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист";
        Man man = new Man(s.substring(4, 8), s.substring(54, 65), Integer.parseInt(s.substring(14, 16)), Double.parseDouble(s.substring(32, 37)));
        System.out.println(man.getName());
        System.out.println(man.getPosition());
        System.out.println(man.getAge());
        System.out.println(man.getHeight());

    }
}
