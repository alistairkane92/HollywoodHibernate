import db.DBHelper;
import models.Actor;
import models.Director;
import models.Studio;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestDBHelper {
    Studio warnerBros = new Studio("WarnerBros", 500000000, "California");

    Actor keanu = new Actor("Keanu", "Reeves", 500000);
    Actor lawrence = new Actor("Lawrence", "Fishbourne", 200000);
    Actor carrie = new Actor("Carrie-Ann", "Moss", 200000);

    Director wachowski1 = new Director("Lilly", 50000);
    Director wachowski2 = new Director("Lana", 50000);

    List<Actor> filmActors = new ArrayList<Actor>();
    List<Director> directors = new ArrayList<Director>();

    @Test
    public void testCanSave() {
        DBHelper.saveUpdate(keanu);
        assertEquals(1, DBHelper.getAll(Actor.class).size());
    }
}
