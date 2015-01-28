/*
 String as are IMMUTABLE. They cannot be changed once created.
 When you 'change' a value of a string, it actually 
 creates a new object and references. Thus it can be inefficient. 

 Anything plus a string will be a string. from left to right.
   mystring = " fifty five is " 5 + 5 => fifty five is 55
   mystring = 5 + 5 + is " is ten" => 10 is ten

 To compare to strings, use the equals() method, not ==. == will compare the 
 references to the strings (memory location)
 
 ENCAPSULATION: packaging of complex functionality to make it easy to use in
  an application.

   -only the things need to know to use are shown - hides complexity
   -internal mechanic are hidden from the user
   -helps to maintain the application in the long run

  -A class method is not within a context of a object; Thus, an class method
    cannot access an instance variable or instance method and vice versa

  

*/

/**
 *
 * @author User
 */
public class Examples {
    public static void main(String[] args){
        Point upperLeft = new Point();
        
        upperLeft.setX((2));
        upperLeft.setY(5);
        upperLeft.print();
    }
    
}
