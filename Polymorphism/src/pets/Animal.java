/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author User
 */
public abstract class Animal {
    String name;
    
    Animal(String name){
        this.name = name;
    }
    
    void breath(){
        System.out.println("breathing");
    }
    
    // Force sub class to implement these methods
    abstract void sound();          
    abstract void eat();    
}
/* Casting

Only a super class variable can reference a sub class object.

*/