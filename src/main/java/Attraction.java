import java.util.ArrayList;

public abstract class Attraction {
    private String name;
    private ArrayList<Visitor> visitors;

    public Attraction(String name) {
        this.name = name;
        this.visitors = new ArrayList<Visitor>();

    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Visitor> getVisitors() {
        return this.visitors;
    }
}
