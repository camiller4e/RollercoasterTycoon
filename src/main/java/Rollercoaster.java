public class Rollercoaster extends Attraction implements ISecurity {
    private int minHeight;
    private int price;


    public Rollercoaster(String name, int minHeight, int price, int rating) {
        super(name, rating);
        this.minHeight = minHeight;
        this.price = price;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getPrice() {
        return price;
    }

    public boolean checkHeight(Visitor visitor) {
        if (visitor.getHeight() > minHeight) {
            return true;
        }
        return false;
    }
}
