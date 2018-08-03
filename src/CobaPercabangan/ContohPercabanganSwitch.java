/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaPercabangan;

/**
 *
 * @author Naufal K D
 */
public class ContohPercabanganSwitch {
    public static void main(String[] args) {
        char grade = 'A';
        
        switch(grade) {
            case 'A' :
                System.out.println("Perfect!");
                break;
            case 'B' :
                System.out.println("Excellent");
                break;
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
                break;
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is "+ grade);
    }
    
}
