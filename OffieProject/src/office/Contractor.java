/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;

/**
 *
 * @author User
 */
public class Contractor extends Employee{
    int contractDuration;
    
    Contractor(String name, float hourlyRate, int contractDuration){
        super(name, hourlyRate);
        this.contractDuration = contractDuration;
    }
    
    void print(){
        System.out.println(name + "'s weekly income is $" + weeklyPay());
        System.out.println(name + " is contractor for " + contractDuration + " months");
    }   
    
}
