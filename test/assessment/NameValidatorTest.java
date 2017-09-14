/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import testUtils.MockData;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Hols
 */
public class NameValidatorTest {
    
    private NameValidator nameValidator;
    
    /**
     *
     */
    @Before
    public void setUp() {
       nameValidator = new NameValidator();
    }

    /**
     * Test of validateName method, of class NameValidator.
     * Success case.
     */
    @Test
    public void testValidateNameSuccess() {
        String fullName = new MockData().singleNameData();
        nameValidator.validateName(fullName);
        int nameLength = fullName.split(" ").length;
        assertThat(nameLength, is(3));
    }
    
    /**
     * Test of validateName method, of class NameValidator.
     * Failure due to single word name. No given names.
     */
    @Test (expected = RuntimeException.class)
    public void testValidateNameNoGivenNames() {
        String fullName = new MockData().noGivenNamesData();
        nameValidator.validateName(fullName);
    }
    
    /**
     * Test of validateName method, of class NameValidator.
     * Failure due to excessive long name. More than 3 given names.
     */
    @Test (expected = RuntimeException.class)
    public void testValidateNameExcessiveNames() {
        String fullName = new MockData().excessiveGivenNamesData();
        nameValidator.validateName(fullName);
    }
}
