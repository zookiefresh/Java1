
package duynguyenhw4;


public class DuyNguyenHw4 {

    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point(0,5);
        Point c = new Point(5,0);
        Point d = new Point(5,5);
        Circle C = new Circle(a, 2);
        C.displayInfo();
        
        Rectangle R = new Rectangle(a, b, c, d);
        R.displayInfo();
    }
    
}
