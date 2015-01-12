/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenduyhw0;

/**
 *
 * @author duy
 */
public class NguyenDuyHw0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        boat myboat = new boat();
        myboat.name = 'd';
        myboat.speed = 0;
        
        myboat.speedup();
        myboat.speedup();
        myboat.speedup();

        myboat.slowdown();
        
        System.out.println(myboat.speed);
    }
    
}

class boat{
    int speed;
    char name;
            
    void speedup(){
        speed += 10;        
    }
    
    void slowdown(){
        speed -= 10;
    }
}