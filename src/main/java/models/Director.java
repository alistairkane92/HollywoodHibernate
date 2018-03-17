package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="directors")
public class Director {
    private int id;
    private String firstName;
    private String surName;
    private int finances;
    private List<Film> films;

    public Director(String firstName, String surName, int finances) {
        this.firstName = firstName;
        this.surName = surName;
        this.finances = finances;
    }

    public Director() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="firstName")
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    @Column(name="surname")
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Column(name="finances")
    public int getFinances() {
        return finances;
    }

    public void setFinances(int finances) {
        this.finances = finances;
    }

    @OneToMany(mappedBy = "director")
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
