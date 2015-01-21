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
    static float maxSpeed = 100.0f;
    static float minSpeed = 0.0f;
    
    void goFast(){
        state = true;
        speed += 10;
        if(speed > maxSpeed){
            speed = maxSpeed;
        }
        
        System.out.println(name + " is raising the sail at the speed of " + speed + " mph");
    }
    
    void goSlow(){
        state = false;
        speed -=5;
        if(speed <  minSpeed){
            speed = minSpeed;
        }
        System.out.println(name + " is lowering the sail at the speed of " + speed + " mph");
    }
    
    void whereIsTheSail(){
        System.out.println(name + "'s sail is " +  ((state) ? "up" : "down"));
    }          
}
