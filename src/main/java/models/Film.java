package models;

import models.Actor;
import models.Director;

import java.util.List;

public class Film {
    private int id;
    private String name;
    private int budget;
    private List<Actor> actors;
    private List<Director> directors;

    public Film(String name, int budget, List<Actor> actors, List<Director> directors) {
        this.name = name;
        this.budget = budget;
        this.actors = actors;
        this.directors = directors;
    }

    public Film() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }
}
