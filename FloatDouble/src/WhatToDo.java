public class WhatToDo {
    public static void main(String[] args) {
        int time = 5;
        int weather = 25;
        boolean late = time > 22 || time<=6;
        boolean cold = weather < 15;
        if (late) {
            System.out.println("Спать");
        }
        if (!late && cold) {
            System.out.println("Читать книгу");
        }
        if (!late && !cold) {
            System.out.println("Гулять");
        }
    }
}
