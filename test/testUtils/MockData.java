/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testUtils;

import assessment.Person;
import assessment.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hols
 */
public class MockData {
    
    private final String SINGLENAMEDATA = "Beau Tristan Bentley";
    
    private final String NOGIVENNAMESDATA = "Johnson";
    
    private final String EXCESSIVEGIVENNAMESDATA = "James Johnson Jones Jameson Smith";
    
    /**
     * Expected list of persons when unordered.
     * 
     */
    private final List<Person> EXPECTEDUNORDEREDLIST = new ArrayList() {{
        add(new Person("Janet Parsons"));
        add(new Person("Vaughn Lewis"));
        add(new Person("Adonis Julius Archer"));
        add(new Person("Shelby Nathan Yoder"));
        add(new Person("Marin Alvarez"));
        add(new Person("London Lindsey"));
        add(new Person("Beau Tristan Bentley"));
        add(new Person("Leo Gardner"));
        add(new Person("Hunter Uriah Mathew Clarke"));
        add(new Person("Hunter Uriah Mathez Clarke"));
        add(new Person("Hunter Uriau Mathew Clarke"));
        add(new Person("Hunter Uriah Mathew Clarke"));
        add(new Person("Mikayla Lopez"));
        add(new Person("Frankie Conner Ritter"));
    }};
    
    /**
     * Expected list of persons when ordered.
     * 
     */
    private final List<Person> EXPECTEDORDEREDLIST = new ArrayList() {{
        add(new Person("Marin Alvarez"));
        add(new Person("Adonis Julius Archer"));
        add(new Person("Beau Tristan Bentley"));
        add(new Person("Hunter Uriah Mathew Clarke"));
        add(new Person("Hunter Uriah Mathew Clarke"));
        add(new Person("Hunter Uriah Mathez Clarke"));
        add(new Person("Hunter Uriau Mathew Clarke"));
        add(new Person("Leo Gardner"));
        add(new Person("Vaughn Lewis"));
        add(new Person("London Lindsey"));
        add(new Person("Mikayla Lopez"));
        add(new Person("Janet Parsons"));
        add(new Person("Frankie Conner Ritter"));
        add(new Person("Shelby Nathan Yoder"));
    }};
    
    /**
     *
     * @return
     */
    public String noGivenNamesData() {
        return NOGIVENNAMESDATA;
    }
    
    /**
     *
     * @return
     */
    public String singleNameData() {
        return SINGLENAMEDATA;
    }
    
    /**
     *
     * @return
     */
    public String excessiveGivenNamesData() {
        return EXCESSIVEGIVENNAMESDATA;
    }
    
    /**
     *
     * @return
     */
    public List<Person> expectedUnorderedList() {
        return EXPECTEDUNORDEREDLIST;
    }
    
    /**
     *
     * @return
     */
    public List<Person> expectedOrderedList() {
        return EXPECTEDORDEREDLIST;
    }
}
