/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Hols
 */
public class GenericListSort {
        
    public void sort(List genericList, Comparator comparator) {
        Collections.sort(genericList, comparator);
    }
}
