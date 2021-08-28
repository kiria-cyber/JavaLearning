public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA + numB;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double multiply(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA * numB;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double divide(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA / numB;
    }

    public double square(double a) {
        return a * a;
    }

    public double square(String a) {
        int numA = Integer.parseInt(a);
        return numA * numA;
    }
}
