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
public class BankAccount {
    int accountNumber;
    float balance;
    Customer cust = null;
    
    BankAccount(String f_name, String l_name, String ssn, float open_balance){
        cust = new Customer(f_name, l_name, ssn);
        balance = open_balance;
    }
    
    void deposit(){
        
    }
    void withdraw(){
        
    }
    void applyInterest(){

    }
    void checkBalance(){
        
    }
}
