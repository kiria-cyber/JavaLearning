public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        director.force(new Cookble() {
            @Override
            public void cook() {
                System.out.println("I am cooking!!!");
            }
        });

        director.force(new Counter() {
            @Override
            public String Order(int countMonths) {
                return  "Отчет за " + countMonths + " месяцев";
            }
        },6);

        MyCounter counter2 = new MyCounter();
        director.force(counter2,8);
    }
}
