/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankApp;

/**
 *
 * @author duynguyen
 */
public class Customer {
    public String firstname;
    public String lastname;
    public String socialSecurityNumber;
    
    Customer(String firstName, String lastName, String socialSecurityNumber){
        this.firstname = firstName;
        this.lastname = lastName;        
        this.socialSecurityNumber = socialSecurityNumber;        
    }
    
    Customer(){
        
    }
    
    private boolean socialIsValid(){
        return true;
    }
}
