package edu.estatuas.galleygrub.items;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ItemTest {

    @Test
    public void equals_test() {

        Item patty = new Item("Krabby Patty", 1.25);
        Item kpatty = new Item("Krabby Patty", 1.25);
        Item tpatty = new Item("Krabby Patty", 0.25);

        assertTrue(patty.equals(kpatty));
        assertFalse(patty.equals(tpatty));

    }
    
}