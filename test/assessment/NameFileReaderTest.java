/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import testUtils.MockData;
import testUtils.TestUtils;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author Hols
 */
public class NameFileReaderTest {
    
    /**
     * Test of ProcessFile method, of class NameFileReader.
     * Tests for size, not empty, same size as expected result, same names as result
     */
    @Test
    public void testProcessFile() {
        NameFileReader instance = new NameFileReader("test/unsorted-names-list.txt");
        List<String> expResult = TestUtils.ConvertPersonListToNameList(new MockData().expectedUnorderedList());
        List<String> result = TestUtils.ConvertPersonListToNameList(instance.ProcessFile());
        assertThat(result.size(), is(14));
        assertThat(result.size(), is(expResult.size()));
        assertThat(result, not(is(new ArrayList())));
        assertThat(result, is(expResult));
    }
    
    /**
     * Test of ProcessFile method, of class NameFileReader.
     * Tests invalid file name
     */
    @Test (expected = RuntimeException.class)
    public void testProcessFileWithWrongFileName() {
        NameFileReader instance = new NameFileReader("WrongFileName.txt");
        instance.ProcessFile();
    }
}
