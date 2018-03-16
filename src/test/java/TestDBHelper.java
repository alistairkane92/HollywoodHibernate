import models.Actor;
import models.Studio;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDBHelper {
    Studio warnerBros = new Studio("WarnerBros", 500000000, "California");

    Actor keanu = new Actor("Keanu", "Reeves", 500000);
    Actor lawrence = new Actor("Lawrence", "Fishbourne", 200000);
    Actor carrie = new Actor("Carrie-Ann", "Moss", 200000);

    Director wachowski1 = new Director("Lilly", 50000);
    Director wachowski2 = new Director("Lana", 50000);

    Film film = new Film("The Matrix", 63000000, filmActors, directorList);

    @Test
    public void testCanSave() {
        DBHelper.saveUpdate(keanu);
        assertEquals(1, DBHelper.getAll(Actor.class));
    }
}
