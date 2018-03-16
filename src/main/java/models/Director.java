package models;

public class Director {
    private int id;
    private String name;
    private int finances;

    public Director(String name, int finances) {
        this.name = name;
        this.finances = finances;
    }

    public Director() {
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

    public int getFinances() {
        return finances;
    }

    public void setFinances(int finances) {
        this.finances = finances;
    }
}
