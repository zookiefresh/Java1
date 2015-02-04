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
public class Employee {
    String name;
    float hourlyRate;
    int hoursWorkedPerWeek;  
    float weeklyIncome;
    
    Employee(String name, float hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;
    }    
    
    float weeklyPay(){        
        return hoursWorkedPerWeek * hourlyRate;
    }
}
