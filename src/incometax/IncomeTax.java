/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incometax;
import java.util.Scanner;
/**
 *
 * @author Knappkin
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner(System.in);
       double tax, salary;
       System.out.println("Income Tax Calculator");
       System.out.println("Enter your Salary: ");
       salary = keyedInput.nextDouble();
       if (salary<=46605){
           tax = tax = salary*15/100;
       }
       else if (salary>=46606 && salary<=93208){
           tax = (salary-46605)*20.5/100+6991;
       }
       else if (salary>=93209 && salary<=144489){
           tax = (salary-93208)*26/100+16544;
       }
       else if (salary>=144490 && salary<=205842){
           tax = (salary-144489)*29/100+29877;
       }
       else {
           tax = (salary-205842)*33/100+47670;
       }
     System.out.printf("Your tax is: $%.2f ", tax);
    }
    
}
