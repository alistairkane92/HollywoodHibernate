import db.DBHelper;
import models.Actor;
import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestDBHelper {
    Studio warnerBros = new Studio("WarnerBros", 500000000, "California");

    Director wachowski = new Director("Lilly", "Wachowski", 50000);
    Film matrix = new Film("Matrix", 505050, wachowski);
    Actor keanu = new Actor("Keanu", "Reeves", 500000, matrix);
    Actor lawrence = new Actor("Lawrence", "Fishbourne", 234234, matrix);

    @Test
    public void testCanSaveActor() {
        DBHelper.saveUpdate(keanu);
        assertEquals(1, DBHelper.getAll(Actor.class).size());
    }

    @Test
    public void testCanSaveDirector() {
        DBHelper.saveUpdate(wachowski);
        assertEquals(1, DBHelper.getAll(Director.class).size());
    }

    @Test
    public void testCanSaveFilm() {
        directors.add(wachowski);

        Film matrix = new Film("The Matrix", 63000000, wachowski);
        DBHelper.saveUpdate(matrix);
        assertEquals(1, DBHelper.getAll(Film.class).size());
        DBHelper.delete(matrix);
    }

    @Test
    public void testDelete() {
        DBHelper.saveUpdate(wachowski);
        assertEquals(1, DBHelper.getAll(Director.class).size());
        DBHelper.delete(wachowski);
        assertEquals(0, DBHelper.getAll(Director.class).size());
    }




}
