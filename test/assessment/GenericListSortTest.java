/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import testUtils.MockData;
import testUtils.TestUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hols
 */
public class GenericListSortTest {
        
    private Comparator comparator;
    
    /**
     *
     */
    @Before
    public void setUp() {
        comparator = new PersonComparator();
    }

    /**
     * Test of sort method, of class GenericListSort.
     */
    @Test
    public void testSort() {
        List<Person> unorderedList = new MockData().expectedUnorderedList();
        List<String> expResult = TestUtils.ConvertPersonListToNameList(new MockData().expectedOrderedList());
        new GenericListSort().sort(unorderedList, comparator);
        List<String> result = TestUtils.ConvertPersonListToNameList(unorderedList);
        assertThat(result.size(), is(14));
        assertThat(result.size(), is(expResult.size()));
        assertThat(result, not(is(new ArrayList())));
        assertThat(result, is(expResult));
    }
}