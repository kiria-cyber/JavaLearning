public class Triangle extends Figure {
    private double c;


    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(double size) {
        super(size, size);
        this.c = size;
    }

    public double area() {
        double p = (getA() + getB() + c) / 2;
        double s = p * (p - getA()) * (p - getB()) * (p - c);
        return Math.sqrt(s);
    }

    @Override
    public void showInfo() {
        double a = getA();
        double b = getB();
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }

}
