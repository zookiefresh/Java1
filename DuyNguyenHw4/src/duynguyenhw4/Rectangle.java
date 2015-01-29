/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duynguyenhw4;

/**
 *
 * @author duy
 */
public class Rectangle {
    Point uL = new Point();
    Point uR = new Point();
    Point lL = new Point();
    Point lR = new Point();
    
    float length;
    float height;
    
    Rectangle(Point lowerLeft, Point lowerRight, Point upperLeft, Point upperRight){
        uL = upperLeft;
        uR = upperRight;
        lL = lowerLeft;
        lR = lowerRight;
    }
            
    float getDistance(Point p1, Point p2){
        float x = p2.getX() - p1.getX();
        float y = p2.getY() - p1.getY();
        return (float) Math.sqrt((x*x + y*y));
    }
    
    float getHeight(){
        return getDistance(uL, lL);
    }
    
    float getLength(){
        return getDistance(uL, uR);
    }     
    
    float getArea(){
        return this.getLength() * this.getHeight();
    }
    
    void displayInfo(){
        
        System.out.println("Upper Left Point (x,y): " + uL.getX() + "," + uL.getY());
        System.out.println("Upper Right Point (x,y): " + uR.getX() + "," + uR.getY());
        System.out.println("Lower Left Point (x,y): " + lL.getX() + "," + lL.getY());
        System.out.println("Lower Left Point (x,y): " + lR.getX() + "," + lR.getY());
        System.out.println("Length :" + this.getLength());
        System.out.println("Height :" + this.getHeight());
        System.out.println("Area: "+ this.getArea());
    }
}
