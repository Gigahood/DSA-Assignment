/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchEngine;

import DataClass.StudentRegistration;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ViewRegistrationDetail {

    public ViewRegistrationDetail() {
        System.out.println("This is ViewRegistrationDetail");
        Scanner s = new Scanner(System.in);
        String num;
        String ic;
        boolean result;
        System.out.println("Please enter your Registration Number");
        num = s.nextLine();
        System.out.println("Please enter your password: ");
        ic = s.nextLine();
        
        for(int i = 0; i < Main.db.registerList.size(); i++){
            StudentRegistration student = Main.db.registerList.get(i);
            for (int j = 0 ; j < i; j++){
                if (num.equals(student.getRegistrationID()) && ic.equals(student.getPassword())){
                System.out.println("Your current registration status is : " + student.getStatus());
                result = true;
                break;
            }                
            else 
                    System.out.println("Invalid Registration Number or Password");
            }
        }
        
        
    }
    
}
