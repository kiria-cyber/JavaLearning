package main;

import box.Box;
import box.BoxWeight;

public class Main {
    public static void main(String[] args) {
       Box box = new Box (15);
        BoxWeight boxWeight = new BoxWeight(11, 4, 7, 2);
        box.showInfo();
        boxWeight.showInfo();

    }


}
