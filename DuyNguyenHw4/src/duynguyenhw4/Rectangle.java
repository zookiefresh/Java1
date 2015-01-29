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
    
    Rectangle(Point upperLeft, Point upperRight, Point lowerLeft, Point lowerRight){
        uL = upperLeft;
        uR = upperRight;
        lL = lowerLeft;
        lR = lowerRight;
    }
}
