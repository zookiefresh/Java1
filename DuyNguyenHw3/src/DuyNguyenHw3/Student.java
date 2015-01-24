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
public class Student {
    static int A_min = 90;
    static int B_min = 80;
    static int C_min = 70;
    static int D_min = 60;
    
    String name;
    int grade;
    char letterGrade;
    
    void initializeStudent(String s_name, int s_grade){
        name = s_name;
        grade = s_grade;
        
        if (s_grade >= A_min){
            letterGrade = 'A';
        }
        else if (s_grade >= B_min && s_grade < A_min){ 
            letterGrade = 'B';
        }
        else if (s_grade >= C_min && s_grade < B_min){
            letterGrade = 'C';
        }
        else if (s_grade >= D_min && s_grade < C_min){
            letterGrade = 'D';
        }
        else {
            letterGrade = 'F';
        }    
    }
}
