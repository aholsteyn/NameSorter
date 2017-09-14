/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

/**
 *
 * @author Hols
 */
public class NameValidator {

    /**
     *
     * @param fullName
     */
    public void validateName(String fullName) {
        int namesTotal = fullName.split(" ").length;
        if (namesTotal <= 1 || namesTotal > 4)
            throw new RuntimeException("Input name (" + fullName + ") has no last name or more than 3 given names.");
    }
}
