public class Visitor {
    private String name;
    public int age;
    public int height;
    public int scrilla;

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
