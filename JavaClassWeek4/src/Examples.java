/*
 * String as are IMMUTABLE. They cannot be changed once created.
 * When you 'change' a value of a string, it actually 
 * creates a new object and references. Thus it can be inefficient. 
 *
 * Anything plus a string will be a string. from left to right.
 *   mystring = " fifty five is " 5 + 5 => fifty five is 55
 *   mystring = 5 + 5 + is " is ten" => 10 is ten
 *
 * To compare to strings, use the equals() method, not ==. == will compare the 
 * references to the strings (memory location)
 */

/**
 *
 * @author User
 */
public class Examples {
    
}
