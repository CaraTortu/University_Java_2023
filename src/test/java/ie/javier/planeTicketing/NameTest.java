package ie.javier.planeTicketing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NameTest 
{
    @Test
    public void testFemale()
    {
        Name name = new Name("Ms", "Marie", "Last");        
        assertTrue( name.isFemale() );
    }

    @Test
    public void testMale()
    {
        Name name = new Name("Mr", "John", "The First");       
        assertTrue( !name.isFemale() );
    }
}
