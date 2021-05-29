public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster(2,5,7);
        Monster monster2 = new Monster();
        Monster monster3 = new Monster(88);
        Monster monster4 = new Monster(1,17);
        monster.voice();
        monster2.voice(1);
        monster3.voice(12,"офлыд");
    }


}
