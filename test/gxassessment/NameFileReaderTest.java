/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gxassessment;

import assessment.NameFileReader;
import assessment.Person;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hols
 */
public class NameFileReaderTest {
    
    public NameFileReaderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ProcessFile method, of class NameFileReader.
     */
    @Test
    public void testProcessFile() {
        System.out.println("Process File with correct name");
        NameFileReader instance = new NameFileReader("unsorted-names-list.txt");
        List<Person> expResult = null;
        List<Person> result = instance.ProcessFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test (expected = RuntimeException.class)
    public void testProcessFileWithWrongFileName() {
        System.out.println("Process File with wrong file name");
        NameFileReader instance = new NameFileReader("WrongFileName.txt");
        List<Person> result = instance.ProcessFile();
    }
    
}
