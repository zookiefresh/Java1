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
public class PetHome {
    public static void main(String[] args){
        
        Animal[] pets = {   new Dog("Simba"),
                            new Cat("Cookie"),
                            new Poodle("Chao")
                        };
        
        for (int i = 0; i < pets.length; i++){
            pets[i].sound();
            pets[i].eat();
        }
        
        Dog aDog = new Dog("blue");
        Animal aAnimal = aDog;
        // Poodle aPoodle = (Poodle) aDog; // illegal assignment
        
        Poodle aPoodle = new Poodle("Cho");
        aAnimal = aPoodle;
        // aAnimal.attitude(); // cannot do this
        ((Poodle) aAnimal).attitude();
        
        Dog.isThisDog(pets[1]);
        Dog.isThisDog(pets[0]);
        Dog.isThisDog(aDog);
        Dog.isThisDog(aPoodle);
    }
}
