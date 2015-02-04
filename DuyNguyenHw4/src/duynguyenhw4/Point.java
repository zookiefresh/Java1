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
public class Point {    
    private int x;
    private int y;
   
    public Point(int x, int y){
        this.x = x;
        this.y = y;       
    }
    
    public Point(){
        this.x = 0;
        this.y = 0;       
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    // When you create a static method, you don't need an object to use the method.
    // i.e. You can do something like Point.calcDistance( point1, point2) 
    // without having an object point. 
    public static double calcDistance(Point p1, Point p2){
        double part1 = (p2.x- p1.x) * (p2.x- p1.x);
        double part2 = (p2.y - p1.y) * (p2.y - p1.y);
        return Math.sqrt(part1 + part2);        
    }
}
