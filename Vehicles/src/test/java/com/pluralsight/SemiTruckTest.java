package com.pluralsight;

import junit.framework.TestCase;

public class SemiTruckTest extends TestCase {
    private SemiTruck semi = new SemiTruck(
                123456, 2023, "Freightliner", "Cascadia", "White", 120000, 135000.00, 2, 80000, 300
    );
    @Override
    public void setUp() throws Exception {
        super.setUp();

    }

    public void testSuperclassGetters() {
        assertEquals(80000, semi.getCargoCapacity());
    }

    public void testLoad() {
        semi.load(2000);
        assertEquals((double) semi.getCargoCapacity() - 2000, semi.getRemainingCapacity());
    }

    public void testUnload() {
        semi.load(2000);
        semi.unload(1000);
        assertEquals((double) semi.getCargoCapacity() - 1000, semi.getRemainingCapacity());
    }

    public void testGetRemainingCapacity() {
        semi.getRemainingCapacity();
    }
}