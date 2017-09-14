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
public class Person implements IPerson {
   
    private Name name;
    
    public Person (String fullName) {
        name = new Name(fullName);
    }
    
    @Override
    public Name getName() {
        return name;
    }
    
    @Override
    public void setName(Name newName) {
        name = newName;
    }
}
