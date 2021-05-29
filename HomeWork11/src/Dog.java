public class Dog {
    String Name;
    String type;
    int speed;
    String running = "";

    void run() {
        for (int i = 0; i < speed - 1; i++) {
            running = running + "бегу, ";
        }
        running = running + "бегу.";
        System.out.println(running);
    }

    String info() {
        return Name + ", " + type + ", " + speed;
    }



}
