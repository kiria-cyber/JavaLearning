public class Food {
    public static void main(String[] args) {
        int many = 1990;
        if (many < 100) {
            System.out.println("Купить доширак");
        } else if (many < 200) {
            System.out.println("Купить шаурму");
        } else if (many < 500) {
            System.out.println("Купить пиццу");
        } else {
            System.out.println("Купить роллы");
        }
    }
}
