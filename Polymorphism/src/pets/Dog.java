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
    
    static boolean isThisDog(Animal animal){
        if(animal.getClass() == Dog.class || Poodle.class == animal.getClass()){
            System.out.println(animal.name + " is a dog");
            return true;    
        }
        else{
            System.out.println("Whatever");
            return false;
        }
    }
    
}
