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
public class Exempt extends Employee{
    int vacationTime;
    Exempt(String name, float hourlyRate, int vacationTime){
        super(name, hourlyRate);
        this.vacationTime = vacationTime;
    }
    
    void print(){
        System.out.println(name + "'s weekly income is " + weeklyPay());
        System.out.println(name + " current vacation time is " + vacationTime);
    }
}
