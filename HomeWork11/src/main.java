public class main {
    public static void main(String[] args) {
        Dog Dog1 = new Dog();
        Dog1.Name="Puppu";
        Dog1.type="Good boy";
        Dog1.speed=15;
        Dog1.run();
        String info1 = Dog1.info();
        System.out.println(info1);
    }
}
