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
public class Name {
    
    private String lastName;
    private String givenNames;

    /**
     *
     * @param fullName
     */
    public Name (String fullName) {
        new NameValidator().validateName(fullName);
        setName(fullName);
    }
    
    private void setName(String fullName) {
        int lastWord = fullName.lastIndexOf(" ");
        lastName = fullName.substring(lastWord + 1);
        givenNames = fullName.substring(0, lastWord);
    }
    
    /**
     *
     * @param fullName
     */
    public void updateName(String fullName) {
        setName(fullName);
    }
    
    /**
     *
     * @return
     */
    public String getGivenNames() {
        return givenNames;
    }
    
    /**
     *
     * @param givenNames
     */
    public void setGivenNames(String givenNames) {
        this.givenNames = givenNames;
    }
    
    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }  
    
    @Override
    public String toString() {
        return givenNames + " " + lastName;
    }
}