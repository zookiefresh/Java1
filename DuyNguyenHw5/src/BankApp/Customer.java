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
        
        checkSocial(socialSecurityNumber);
        this.socialSecurityNumber = socialSecurityNumber;   
        
    }
    
    Customer(){
        
    }
    
    private static void checkSocial(String s){
        if(!s.matches("\\d{3}-\\d{2}-\\d{4}")){
            System.out.println("'"+ s 
                    + "' seems to be an invalid social security number!");
        }
    }
}
