public class Director {
    public void force(Cookble cookble){
        cookble.cook();
    }
    public void force(Counter counter, int countMonths){
        String Order = counter.Order(countMonths);
        System.out.println(Order);
    }
}
