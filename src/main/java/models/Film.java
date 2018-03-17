package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="films")
public class Film {
    private int id;
    private String name;
    private int budget;
    private List<Actor> actors;
    private Director director;

    public Film(String name, int budget, Director director) {
        this.name = name;
        this.budget = budget;
        this.director = director;
    }

    public Film() {
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

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @OneToMany(mappedBy = "film", fetch = FetchType.EAGER)
    public List<Actor> getActors() { return actors; }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @ManyToOne
    @JoinColumn(name="director_id", nullable = false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
