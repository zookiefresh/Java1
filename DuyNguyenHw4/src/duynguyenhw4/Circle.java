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
public class Circle {
    Point centerPoint = new Point();
    private final float PI = 3.14f;
    private float radius;
    float area;
    
    Circle(Point centerOfCircule, float radius){
        this.radius = radius;
        this.centerPoint = centerOfCircule;
        setArea();
    }
    Circle(){
        this.radius = 0;        
    }
    
    void setArea(){
        area = PI * radius * radius;
    }
    
    void displayInfo(){
        System.out.println("Center Point (x,y): " + centerPoint.getX() + "," + centerPoint.getY());
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}
