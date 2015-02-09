/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

/**
 *
 * @author duy
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String good_ssn = "123-12-1234";
        String[] bad_ssn = {"", "1234-12-1234", "12-12-1234", "123-123-1234","123-1-1234", "123-12-12345", "123-12-123", "A23-12-1234","123-1B-1234","123-12-123C"};
        
        checkSocial(good_ssn);
        for(String ssn : bad_ssn){
            checkSocial(ssn);
        }
        
        
    }
    
    private static void checkSocial(String s){
        if(!s.matches("\\d{3}-\\d{2}-\\d{4}")){
            System.out.println("'"+ s + "' seems to be a malformed ssn!");
        }
    }
    
}
