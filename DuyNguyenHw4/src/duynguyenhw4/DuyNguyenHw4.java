
package duynguyenhw4;


public class DuyNguyenHw4 {

    public static void main(String[] args) {
        Point upperLeft = new Point(1,5);
        Point lowerLeft = new Point(1,1);
        Point upperRight = new Point(5,5);
        Point lowerRight = new Point(5,1);
                
        Rectangle r1 = new Rectangle(upperLeft,lowerLeft, upperRight, lowerRight);
        r1.displayInfo();
        
        Point center = new Point(10,10);
        int radius = 4;
        
        Circle c1 = new Circle(center, radius);
        c1.displayInfo();
        
        Point p = new Point (10,20);
        // Objects are 'pass by reference' in JAVA
        changePoint(p);
        System.out.println("Point = "+ p.x + "," + p.y);
    }
    
    // Pass by reference: p1 is object reference    
    static void changePoint(Point p1){
        
        p1.x = 100;
        p1.y = 200;
    }
    
    // An object will remain until there are no references to it
    // A lifetime of an object depends on the scope that holds it
}
