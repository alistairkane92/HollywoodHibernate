package models;

public class Actor {
    private int id;
    private String firstName;
    private String surName;
    private int finances;

    public Actor(String firstName, String surName, int finances) {
        this.firstName = firstName;
        this.surName = surName;
        this.finances = finances;
    }

    public Actor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getFinances() {
        return finances;
    }

    public void setFinances(int finances) {
        this.finances = finances;
    }
}
