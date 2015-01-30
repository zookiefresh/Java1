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
    private Point uL = new Point();
    private Point uR = new Point();
    private Point lL = new Point();
    private Point lR = new Point();    
    private float length;
    private float height;
    private float area;
    
    Rectangle(Point lowerLeft, Point lowerRight, Point upperLeft, Point upperRight){
        uL = upperLeft;
        uR = upperRight;
        lL = lowerLeft;
        lR = lowerRight;
        length = getDistance(uL, lL);
        height = getDistance(uL, uR);
        area = length * height;
    }
            
    float getDistance(Point p1, Point p2){
        float x = p2.getX() - p1.getX();
        float y = p2.getY() - p1.getY();
        return (float) Math.sqrt((x * x + y * y));
    }    
    
    void displayInfo(){        
        System.out.println("Upper Left Point (x,y): " + uL.getX() + "," + uL.getY());
        System.out.println("Upper Right Point (x,y): " + uR.getX() + "," + uR.getY());
        System.out.println("Lower Left Point (x,y): " + lL.getX() + "," + lL.getY());
        System.out.println("Lower Left Point (x,y): " + lR.getX() + "," + lR.getY());
        System.out.println("Length :" + length);
        System.out.println("Height :" + height);
        System.out.println("Area: "+ area);
    }
}
