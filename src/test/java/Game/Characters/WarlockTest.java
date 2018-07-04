package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarlockTest {
   
    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock(100);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, warlock.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        warlock.setHealthPoints(40);
        assertEquals(40, warlock.getHealthPoints());
    }
}