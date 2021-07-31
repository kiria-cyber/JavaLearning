package box;

public class BoxWeight extends Box {
    private double weight;


    public BoxWeight() {
        super();
        weight = 0;
    }

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight);
    }
}
