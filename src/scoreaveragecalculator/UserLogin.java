/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreaveragecalculator;

import java.util.Scanner;


public class UserLogin {
    public static void main(String[] args) {
        String username, password;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Username:");
        username = input.nextLine();
        
        System.out.println("Enter Password:");
        password = input.nextLine();
        
        if (username.equals("Patika") && password.equals("123AA321")){
            System.out.println("\nSuccessfully entered! Good to go..");
        } else {
            System.out.println("Unsuccessful login attempt. Try again!!!");
        }
    }
}
