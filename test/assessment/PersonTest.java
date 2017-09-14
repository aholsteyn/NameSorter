/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import testUtils.MockData;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hols
 */
public class PersonTest {
    
    private Person person;
    private String fullName;
    
    /**
     *
     */
    @Before
    public void setUp() {
        fullName = new MockData().singleNameData();
        person = new Person(fullName);
    }
    
    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        Name name = person.getName();
        assertNotNull(person);
        assertNotNull(name);
        assertEquals(name.toString(), fullName);
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        Name name = person.getName();
        Name newName = new Name("John Jameson Johnson");
        person.setName(newName);
        assertNotNull(person);
        assertNotNull(name);
        assertEquals(person.getName().toString(), "John Jameson Johnson");
    }
}
