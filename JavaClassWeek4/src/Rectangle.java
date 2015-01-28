/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Rectangle {
    private Point ul;
    private Point lr;
    private int height;
    private int length;
    private int area;
    
    Rectangle(Point upperLeft, Point lowerRight){
        ul = upperLeft;
        lr = lowerRight;
        height = ul.getY() - lr.getY();
        length = lr.getX() - ul.getX();
        area = length * height;
    }
    
    public int getArea(){
        return area;
    }
}
