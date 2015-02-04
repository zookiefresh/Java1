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
public class CheckingAccount extends BankAccount {    
    float interestRage = 0.02f;
    
    CheckingAccount(String firstName, String lastName, String socialSecurityNumber, float openingBalance){
        super(firstName, lastName, socialSecurityNumber, openingBalance);
    }
}
