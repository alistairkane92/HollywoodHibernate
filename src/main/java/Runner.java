import db.DBHelper;
import models.Actor;
import models.Director;
import models.Film;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director("Bob", "Bobbington", 234243);
        Film matrix = new Film("The Matrix", 304534, director);
        Actor keanu = new Actor("Keanu", "Reeves", 234234, matrix);
        System.out.println("hi");
        DBHelper.saveUpdate(keanu);
        List<Actor> actors = DBHelper.getAll(Actor.class);
    }
}
