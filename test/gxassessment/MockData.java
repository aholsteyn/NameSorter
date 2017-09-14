/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gxassessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hols
 */
public class MockData {
    
    public List<String> emptyData() {
        return null;
    }
    
    public List<String> noGivenNamesData() {
        return Arrays.asList("James Smith", "James");
    }
    
    public List<String> excessiveGivenNamesData() {
        return Arrays.asList("James Smith", "James Johnson Jones Jameson Smith");
    }
    
    
}
