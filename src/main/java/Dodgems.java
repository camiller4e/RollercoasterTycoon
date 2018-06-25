public class Dodgems extends Attraction implements ITicketed {
    private int kidsPrice;
    private int adultPrice;

    public Dodgems(String name, int kidsPrice, int adultPrice, int rating) {
        super(name, rating);
        this.kidsPrice = kidsPrice;
        this.adultPrice = adultPrice;
    }

    public int getKidsPrice() {
        return kidsPrice;
    }

    public int getAdultPrice() {
        return adultPrice;
    }

    public void charge(Visitor visitor, Dodgems dodgems) {
        if (visitor.age < 12) {
            visitor.scrilla -= dodgems.kidsPrice;
        }
        else visitor.scrilla -= dodgems.adultPrice;

    }
}

