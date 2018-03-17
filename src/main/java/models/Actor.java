package models;

import javax.persistence.*;

@Entity
@Table(name="actors")
public class Actor {
    private int id;
    private String firstName;
    private String surName;
    private int finances;
    private Film film;

    public Actor(String firstName, String surName, int finances, Film film) {
        this.firstName = firstName;
        this.surName = surName;
        this.finances = finances;
        this.film = film;
    }

    public Actor() {
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

    @Column(name="firstNames")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name="surnames")
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

    @ManyToOne
    @JoinColumn(name="film_id", nullable = false)
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
