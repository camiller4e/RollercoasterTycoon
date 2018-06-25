import java.util.ArrayList;

public abstract class Attraction {
    private String name;
    private ArrayList<Visitor> visitors;
    private int rating;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitors = new ArrayList<Visitor>();

    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Visitor> getVisitors() {
        return this.visitors;
    }

    public int getRating() {
        return rating;
    }
}
