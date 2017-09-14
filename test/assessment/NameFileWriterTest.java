/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import testUtils.MockData;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author Hols
 */
public class NameFileWriterTest {
    
    /**
     * Test of Write method, of class NameFileWriter.
     * Tests if file is created and if contents match the expected sorted names
     */
    @Test
    public void testWrite() throws RuntimeException {
        String resultFileName = "test/sorted-names-list-test.txt";
        String originalFileName = "test/sorted-names-list.txt";
        NameFileWriter instance = new NameFileWriter(resultFileName);
        List<Person> persons = new MockData().expectedOrderedList();
        String s1, s2;
        try {
            instance.Write(persons);
            s1 = new String(Files.readAllBytes(Paths.get(originalFileName)), StandardCharsets.UTF_8);
            s2 = new String(Files.readAllBytes(Paths.get(resultFileName)), StandardCharsets.UTF_8);
        } catch (RuntimeException | IOException e) {
            throw new RuntimeException(e);
        }
        assertTrue(new File(resultFileName).exists());
        assertEquals(s1, s2);
    }
    
    /**
     * Test of FileWriter method, of class NameFileWriter.
     * Tests invalid file name. Throws IOException when trying to write to directory
     */
    @Test (expected = RuntimeException.class)
    public void testFileWriterWithWrongFileName() throws RuntimeException {
        NameFileWriter instance = new NameFileWriter("test/");
        try {
            instance.Write(new MockData().expectedOrderedList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
