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
        int lastWord = fullName.lastIndexOf(" ");
        //if (lastWord > 4) throw InvalidGivenNamesException();
        lastName = fullName.substring(lastWord + 1);
        givenNames = fullName.substring(0, lastWord);
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
