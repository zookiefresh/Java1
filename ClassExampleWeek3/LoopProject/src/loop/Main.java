/*
 * To pass arguments in, right click on project properties. 
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
        
        int z = average(a,b);
        System.out.println("The average of " + a + " and " + b + " is "+ z);
        
        float f1 = 34.5f;
        float f2 = 53.2f;
        
        float avg = average(f1,  f2);
        System.out.println("The average of " + f1 + " and " + f2 + " is "+ avg);
        
        // Array example
        int[] numbers = {3,4,8,1,-4};
        
        for( int i = 0; i < numbers.length; i++){
            System.out.println("index " + i + " is " + numbers[i]);
        }
        
        System.out.println("The average of the array is " + average(numbers) );
        
        Student[] roster = new Student[10];
        for(int i = 0; i < roster.length; i++){
            roster[i] = new Student();
        }
        roster[2].name = "Duy";
        roster[2].grade = "A";
        System.out.println(roster[2].name + "'s grade is " + roster[2].grade);              
        for(int i=0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
    // This is method overloading = Two methods of the same name with different signature. 
    // Method signature = method name + parameter list. 
    //  -- allows same method name with different parameters so you don't  have to remember or define two methods 
    static int average(int x, int y){         
        return (x + y) / 2;
    }    
    static float average(float x, float y){         
        return (x + y) / 2;
    }
    
    static int average(int[] data){
        int sum = 0;
        for (int i=0; i < data.length; i++){
            sum += data[i];
        }
        return sum / data.length;
    }
}

class Student{
    String name;
    String grade;
}