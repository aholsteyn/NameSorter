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
public class NameTest {
    
    private String fullName;
    private Name name;
    
    /**
     *
     */
    @Before
    public void setUp() {
        fullName = new MockData().singleNameData();
        name = new Name (fullName);
    }

    /**
     * Test of updateName method, of class Name.
     */
    @Test
    public void testUpdateName() {
        name.updateName("John Jameson Smith Johnson");
        assertNotNull(name);
        assertEquals(name.toString(), "John Jameson Smith Johnson");
    }

    /**
     * Test of getGivenNames method, of class Name.
     */
    @Test
    public void testGetGivenNames() {
        assertNotNull(name);
        assertEquals(name.getGivenNames(), "Beau Tristan");
    }

    /**
     * Test of setGivenNames method, of class Name.
     */
    @Test
    public void testSetGivenNames() {
        name.setGivenNames("John Smith Jameson");
        assertNotNull(name);
        assertEquals(name.toString(), "John Smith Jameson Bentley");;
    }

    /**
     * Test of getLastName method, of class Name.
     */
    @Test
    public void testGetLastName() {
        assertNotNull(name);
        assertEquals(name.getLastName(), "Bentley");
    }

    /**
     * Test of setLastName method, of class Name.
     */
    @Test
    public void testSetLastName() {
        name.setLastName("Adams");
        assertNotNull(name);
        assertEquals(name.toString(), "Beau Tristan Adams");
    }

    /**
     * Test of toString method, of class Name.
     */
    @Test
    public void testToString() {
        assertNotNull(name);
        assertEquals(name.toString(), fullName);
    }
    
}
