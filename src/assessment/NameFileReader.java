/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hols
 */
public class NameFileReader {
    
    private final String FILENAME;

    /**
     *
     * @param fileName
     */
    public NameFileReader(String fileName) {
        this.FILENAME = fileName;
    }
    
    /**
     *
     * @return
     */
    public List<Person> ProcessFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            
            String name;
            List<Person> personsList = new ArrayList();

            while ((name = br.readLine()) != null)
            {
                personsList.add(new Person(name));
            }
            
            return personsList;

        } catch (IOException e) {
            throw new RuntimeException("Could not read file: " + FILENAME, e);
        }
    }
}
