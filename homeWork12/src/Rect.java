public class Rect {
    double width;
    double height;

    void setDimens(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double Perimeter() {
        double perimeter = 2 * (width + height);
        return perimeter;
    }

    double Square() {
        double square = width * height;
        return square;
    }

}
