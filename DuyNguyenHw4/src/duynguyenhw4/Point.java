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
}
