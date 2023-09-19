package ie.javier.planeTicketing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NameTest 
{
    // Test the Name.isFemale function
    @Test
    public void testFemale()
    {
        Name name = new Name("Ms", "Marie", "Last");        
        assertTrue( name.isFemale() );
    
        name = new Name("Mr", "John", "The First");       
        assertTrue( !name.isFemale() );
       
    }

    // Test the comparison
    @Test
    public void testComparison() {
        Name name_a = new Name("Ms", "Marie", "Last");
        Name name_b = new Name("Mrs", "Cora", "McArt");
        Name name_c = new Name("Ms", "Marie", "Last");

        assertTrue(!name_a.equals(name_b));
        assertTrue(name_a.equals(name_c));
    }
}
