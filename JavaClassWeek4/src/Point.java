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
    private final int maxValue = 10;
    
    public void setX(int xValue){
        if(xValue < maxValue) {
            x = xValue;
        }
        else{
            System.out.println("Invalid x value " + xValue);
            x = 0;
        }
    }
    
    public int getX(){
        return x;
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
    public int getY(){
        return x;
    }
    
    public void print(){
        System.out.println("y = " + y + " x = " + x); 
    }
}
