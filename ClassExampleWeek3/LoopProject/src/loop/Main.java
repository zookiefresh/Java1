/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        
        int z =  average(a,b);
        System.out.println("The average of " + a + " and " + b + " is "+ z);
    }
    
    static int average(int x, int y){
        int avg =  (x + y) / 2;
        return avg;
    }
}
