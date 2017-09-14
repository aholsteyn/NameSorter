/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testUtils;

import assessment.Person;
import assessment.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hols
 */
public class TestUtils {
    
    /**
     * As cannot assert between lists of objects due to different hash codes,
     * convert to list of names so they can be compared
     * @param persons - list of persons
     * @return list of names
     */
    public static List<String> ConvertPersonListToNameList(List<Person> persons) {
        List<String> personsNames = new ArrayList();
        persons.forEach((p) -> { personsNames.add(p.getName().toString()); });
        return personsNames;
    }
}
