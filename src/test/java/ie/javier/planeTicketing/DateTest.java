package ie.javier.planeTicketing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DateTest {
    // Test the Date equals
    @Test
    public void testDateEquals() {
        Date a = new Date(12, 3, 2024);
        Date b = new Date(14, 2, 2003);

        assertTrue(!a.equals(b));

        b.setDay(12);
        b.setMonth(3);
        b.setYear(2024);

        assertTrue(a.equals(b));
    }

    // Test the toString implementation
    @Test
    public void testToString() {
        Date a = new Date(5, 9, 2006);

        assertTrue(a.toString().equals("5/9/2006"));
    }
}
