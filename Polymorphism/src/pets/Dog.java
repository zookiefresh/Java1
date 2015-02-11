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
public class Dog extends Animal {
    Dog(String name){
        super(name);
    }
    
    @Override
    void sound(){
        System.out.println("woof");
    }
    
    @Override
    void eat(){
        System.out.println("eats bacon");
    }
    
}
