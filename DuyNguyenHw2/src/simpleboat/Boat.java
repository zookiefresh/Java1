package simpleboat;

/**
 * @author Duy Nguyen 
 * Java 1 Programming X418.85A
 * Tuesday's 6:30 PM
 * Assignment 2  
 */
public class Boat {    
    String name;
    boolean state;
    float speed;        
    
    void goFast(){
        state = true;
        
        speed += 10;
        if(speed > 100){
            speed = 100;
        }
        
        System.out.println(name + " is raising the sail at the speed of " + speed + " mph");
    }
    
    void goSlow(){
        state = false;
        speed -=5;
        if(speed <  0){
            speed = 0;
        }
        System.out.println(name + " is lowering the sail at the speed of " + speed + " mph");
    }
    
    void whereIsTheSail(){
        System.out.println(name + "'s sail is " +  ((state) ? "up" : "down"));
    }          
}
