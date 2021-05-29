package main;
import box.Box;
import test.man;

public class Main {
    public static void main(String[] args) {
        man Man = new man("Иван", 27);
        System.out.println(Man.getAge());
        Box box = new Box(5,15.5,8);
        box.showVolume();
        Box box2 = new Box (11,8.4,4);
        box2.showVolume();
        box.compare(box2);
        box.setDimens(1,4,5);
        box.showVolume();
        box.compare(box2);
    }
}
