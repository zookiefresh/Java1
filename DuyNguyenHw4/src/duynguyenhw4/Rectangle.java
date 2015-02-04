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
    private double length;
    private double height;
    private double area;
    
    public Rectangle(Point upperLeft, Point lowerLeft, Point upperRight, Point lowerRight){
        uL = upperLeft;
        uR = upperRight;
        lL = lowerLeft;
        lR = lowerRight;
        length = Point.calcDistance(uL, uR);
        height = Point.calcDistance(uL, lL);
        area = length * height;
    }
    
    void displayInfo(){    
        System.out.println("Rectangle Info:");
        System.out.println("Upper Left Point (x,y): " + uL.getX() + "," + uL.getY());
        System.out.println("Upper Right Point (x,y): " + uR.getX() + "," + uR.getY());
        System.out.println("Lower Left Point (x,y): " + lL.getX() + "," + lL.getY());
        System.out.println("Lower Left Point (x,y): " + lR.getX() + "," + lR.getY());
        System.out.println("Area: "+ area + "\n");
    }
}
