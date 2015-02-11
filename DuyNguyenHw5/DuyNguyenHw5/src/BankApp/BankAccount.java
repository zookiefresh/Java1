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
    float interestRate;
    
    Customer cust = null;
    
    BankAccount(String f_name, String l_name, String ssn, float open_balance){
        cust = new Customer(f_name, l_name, ssn);
        balance = open_balance;
        accountNumber = 999999999 + (int)(Math.random() * 999999999);
        System.out.printf("Successfully created account %d for %s\n", accountNumber, cust.getName());
        displayBalance();
    }
    
    void deposit(float amt){
        balance = balance + amt;
        System.out.println("Deposited " + amt);
        displayBalance();
    }
    void withdraw(float amt){
        if (amt < balance){
            balance = balance - amt;
            System.out.println(cust.getName() + " withdrew " + amt);
            displayBalance();
        }
        else{
            System.out.println(cust.getName() + "'s withdrawl rejected. Insufficient funds");
        }
            
    }
    void applyInterest(){
        balance = balance * (1 + interestRate);
    }
    
    void checkBalance(){
        displayBalance();
    }
    
    private void displayBalance(){
        System.out.println(cust.getName() + ", " + balance + "\n");
    } 
}
