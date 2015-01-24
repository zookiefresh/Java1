/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuyNguyenHw3;

/**
 *
 * @author duy
 */
public class Roster {
    public static void main(String[] args){
         //check to make sure there is at least one student name passed
        if (args.length == 0) {

            System.out.println("no student names passed … exiting");
            return;   
        }
        
         // create student array “roster”
        Student[] roster = new Student[args.length];

        for (int i = 0 ; i < roster.length ; i++) {
            roster[i] = new Student();                 // create Student object
            int grade = 50 + (int)(Math.random() * 50);       // randomly generate grade
            roster[i].initializeStudent(args[i], grade);             // initialize student in roster
        }

  

        // print student information from roster
        for (int i = 0 ; i < roster.length ; i++) {
            System.out.println(roster[i].name + ", " + roster[i].grade + ", " + roster[i].letterGrade);
        }

       //print average grade        
        System.out.println("The average of class is " + calculateAverageGrade(roster));        
    } 
    
    static int calculateAverageGrade(Student[] list) {
        int sum = 0; 
        for (int i = 0; i < list.length; i++){
            sum += list[i].grade;
        }
        
        return sum / list.length;
    }
}
