/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hols
 */
public class MockData {
    
    private List<String> SAMPLEDATA1 = Arrays.asList(
                "Janet Parsons",
                "Vaughn Lewis",
                "Adonis Julius Archer",
                "Shelby Nathan Yoder",
                "Marin Alvarez",
                "London Lindsey",
                "Beau Tristan Bentley",
                "Leo Gardner",
                "Hunter Uriah Mathew Clarke",
                "Hunter Uriah Mathez Clarke",
                "Hunter Uriau Mathew Clarke",
                "Hunter Uriah Mathew Clarke",
                "Mikayla Lopez",
                "Frankie Conner Ritter");
    
    private final List<String> NOGIVENNAMESDATA = Arrays.asList(
            "James Smith", "James");
    
    private final List<String> EXCESSIVEGIVENNAMESDATA = Arrays.asList(
            "James Smith",
            "James Johnson Jones Jameson Smith");
    
    public List<String> emptyData() {
        return null;
    }
    
    public List<String> noGivenNamesData() {
        return NOGIVENNAMESDATA;
    }
    
    public List<String> excessiveGivenNamesData() {
        return EXCESSIVEGIVENNAMESDATA;
    }
    
    public List<String> simpleData1() {
        return SAMPLEDATA1;
    }
    
    public List<String> largeData() {
        List<String> multipleSampleData = new ArrayList(SAMPLEDATA1);
        for (int i =0; i < 10; i++) {
            multipleSampleData.addAll(multipleSampleData);
        }
        return multipleSampleData;
    }
}
