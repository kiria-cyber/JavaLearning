public class ColorRect extends Rect{
    private String color;

    public ColorRect(double a, double b, String color){
        super(a,b);
        this.color=color;
    }
    public ColorRect(double size){
        super(size);
        this.color = "white";
    }
    @Override
    public void showInfo() {
        double a = getA();
        double b = getB();

        System.out.println("a = " + a + ", b = " + b+ ", color = "+color);
    }

}
