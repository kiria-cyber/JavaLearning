public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(2);
        Box box2 = new Box(3,5,1);
        Box box3 = new Box(box1, box2);
        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
        box1.boxing(box3).showVolume();

    }
}
