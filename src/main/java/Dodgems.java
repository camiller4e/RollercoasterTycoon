public class Dodgems extends Attraction {
    private int kidsPrice;
    private int adultPrice;

    public Dodgems(String name, int kidsPrice, int adultPrice) {
        super(name);
        this.kidsPrice = kidsPrice;
        this.adultPrice = adultPrice;
    }

    public int getKidsPrice() {
        return kidsPrice;
    }

    public int getAdultPrice() {
        return adultPrice;
    }
}
