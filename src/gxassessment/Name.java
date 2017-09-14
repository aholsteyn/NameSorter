/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gxassessment;

/**
 *
 * @author Hols
 */
public class Name {
    
    private String lastName;
    private String givenNames;

    public Name (String fullName) {
        validateName(fullName);
        setName(fullName);
    }

    private void validateName(String fullName) {
        int namesTotal = fullName.split(" ").length;
        if (namesTotal <= 1 || namesTotal > 4)
            throw new RuntimeException("Input name (" + fullName + ") has no last name or more than 3 given names.");
    }
    
    private void setName(String fullName) {
        int lastWord = fullName.lastIndexOf(" ");
        lastName = fullName.substring(lastWord + 1);
        givenNames = fullName.substring(0, lastWord);
    }
    
    public void updateName(String fullName) {
        setName(fullName);
    }
    
    public String getGivenNames() {
        return givenNames;
    }
    
    public void setGivenNames(String givenNames) {
        this.givenNames = givenNames;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }  
    
    @Override
    public String toString() {
        return givenNames + " " + lastName;
    }
}