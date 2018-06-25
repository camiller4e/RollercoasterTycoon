public class Rollercoaster extends Attraction {
    private int minHeight;
    private int price;

    public Rollercoaster(String name, int minHeight, int price) {
        super(name);
        this.minHeight = minHeight;
        this.price = price;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getPrice() {
        return price;
    }
}
