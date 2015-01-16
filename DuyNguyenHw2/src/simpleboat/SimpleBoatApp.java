/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleboat;

/**
 *
 * @author duy
 */
public class SimpleBoatApp {
     public static void main (String[] args) {

        Boat simpleBoat = new Boat();

        simpleBoat.name = "Destiny"; 
        simpleBoat.goFast();   
        simpleBoat.goSlow();
        simpleBoat.whereIsTheSail();
        simpleBoat.goFast();
        simpleBoat.whereIsTheSail();
        
        simpleBoat.speed = 95;
        simpleBoat.goFast();
        simpleBoat.whereIsTheSail();
        
        simpleBoat.speed = 2;
        simpleBoat.goSlow();
        simpleBoat.whereIsTheSail();
        
    }
}
