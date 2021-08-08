package main;

import box.Box;
import box.BoxWeight;
import test.Empty;

public class Main {
    public static void main(String[] args) {
       int random = (int)(Math.random()*90+10);
        String result = String.format("Случайное число %s.Попробуйте еще раз", random);
        System.out.println(result);
    }


}
