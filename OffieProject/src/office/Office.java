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
public class Office {
    public static void main(String [] args){
        Contractor alin = new Contractor("Alin", 50.0f, 12);
        Exempt joe = new Exempt("Joe", 45.0f, 80);
        
        alin.hoursWorkedPerWeek = 20;
        joe.hoursWorkedPerWeek = 40;
        alin.print();
        joe.print();
                
    }
}
