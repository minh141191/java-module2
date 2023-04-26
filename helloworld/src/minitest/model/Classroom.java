package minitest.model;

public class Classroom {
    private static int INDEX = 1;
    private int id;
    private String name;

    public Classroom() {
    }

    public Classroom(String name) {
        this.id = INDEX++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.printf("%-10s%s", this.id, this.name + "\n");
    }

    @Override
    public String toString() {
        return  id + ", " + name;
    }
}
