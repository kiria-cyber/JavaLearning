public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(5, 10);
        Rect rect2 = new Rect( 5);
        Triangle triangle = new Triangle(10, 10, 10);
        Triangle triangle2 = new Triangle(4);
        ColorRect colorRect = new ColorRect(2,7,"blue");
        System.out.println("rect area = " + rect.area());
        System.out.println("triangle area = " + triangle.area());
        System.out.println("rect2 area = " + rect2.area());
        System.out.println("triangle2 area = " + triangle2.area());
        colorRect.showInfo();;
    }
}
