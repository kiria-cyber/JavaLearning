public class Bird extends Animal implements CanRun,Flyble{
    @Override
    public void run() {
        System.out.println("Bird is running");
    }

    @Override
    public void eat() {
        System.out.println("Птичий корм");}

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
