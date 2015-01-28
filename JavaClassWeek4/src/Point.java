/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Point {    
    private int x;
    private int y;
    //private final int maxValue = 10;
    
    // Constructor:
    //   Invoked automatically, no return value
    //   Always define a constructor, even if it does nothing.
    //   You can overload constructors: Define two constructors
    public Point(int x, int y){
        this.x = x;
        this.y = y;       
    }

    /*
    public void setX(int xValue){
        if(xValue < maxValue) {
            x = xValue;
        }
        else{
            System.out.println("Invalid x value " + xValue);
            x = 0;
        }
    }
    public void setY(int yValue){
         if(yValue < maxValue) {
            y = yValue;
        }
        else{
            System.out.println("Invalid x value " + yValue);
            y = 0;
        }
    }
    */
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public void print(){
        System.out.println("y = " + y + " x = " + x); 
    }
}
