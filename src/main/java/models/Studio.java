package models;

public class Studio {
    private int id;
    private String name;
    private int finances;
    private String location;

    public Studio(String name, int finances, String location) {
        this.name = name;
        this.finances = finances;
        this.location = location;
    }

    public Studio() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
