public class Visitor {
    private String name;
    private int age;
    private int height;
    private int scrilla;

    public Visitor(String name, int age, int height, int scrilla) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.scrilla = scrilla;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getScrilla() {
        return scrilla;
    }
}
