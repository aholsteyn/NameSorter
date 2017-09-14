/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gxassessment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Hols
 */
public class NameFileWriter {
    
    private final String FILENAME;
    
    public NameFileWriter (String fileName) {
        this.FILENAME = fileName;
    }
    
    public void Write(List<Person> persons) throws IOException {
        File outputFile = new File(FILENAME);
        if (persons != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                    // Small hack to avoid writing a newline at the end of file
                    writer.write(persons.remove(0).getName().toString());
                    for (Person p : persons) {
                        writer.newLine();
                        writer.write(p.getName().toString());
                    }
            } catch (IOException e){
                throw new RuntimeException("Could not write to file: " + FILENAME, e);
            }
        }
    }
}
