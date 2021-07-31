public class Rect extends Figure {
    public Rect(double a, double b) {
        super(a, b);
    }

    public Rect(double size) {
        super(size, size);
    }

    @Override
    public double area() {
        return getA() * getB();
    }

    @Override
    public void showInfo() {
        double a = getA();
        double b = getB();
        System.out.println("a = " + a + " b = " + b);
    }
}
