public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster() {
        eyes = 2;
        hands = 2;
        legs = 2;
    }

    Monster(int eyes) {
        this.eyes = eyes;
        hands = 2;
        legs = 2;
    }

    Monster(int eyes, int hands) {
        this.eyes = eyes;
        this.hands = hands;
        legs = 2;
    }

    Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int i) {
        for (int j = 0; j <= i; j++) {
            System.out.println("Голос");
        }
    }
    void voice(int i, String word) {
        for (int j = 0; j <= i; j++) {
            System.out.println(word);
        }
    }


}
