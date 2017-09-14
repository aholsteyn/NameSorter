/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gxassessment;

import java.util.Comparator;

/**
 *
 * @author Hols
 */
public class PersonComparator implements Comparator<Person> {
        
    @Override
    public int compare(Person p1, Person p2) {
        return Comparator.comparing(Name::getLastName, String.CASE_INSENSITIVE_ORDER)
            .thenComparing(Name::getGivenNames, String.CASE_INSENSITIVE_ORDER)
            .compare(p1.getName(), p2.getName());
    }
}
