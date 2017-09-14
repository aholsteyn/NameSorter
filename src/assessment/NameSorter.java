/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Hols
 */
public class NameSorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Process input file
            List<Person> persons = new NameFileReader(args[0]).ProcessFile();
            
            // Sort names
            new GenericListSort().sort(persons, new PersonComparator());
            
            // Write sorted list to file
            String outputFileName = "sorted-names-list.txt";
            new NameFileWriter(outputFileName).Write(persons);
            
            // Write sorted list to output
            persons.forEach(person -> System.out.println(person.getName()));

        } catch(RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
