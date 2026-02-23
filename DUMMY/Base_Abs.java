package com.mycompany.fixed_mid_exam;
import java.util.Scanner;

abstract class Base_Abs {
    abstract void register(Base_Encap sam);
    //abstract void login(Base_Encap sam, String name, int number, String password);
    //abstract void editAcc(Base_Encap sam, String name, int number, String password);
    //abstract void showInfo(Base_Encap sam);
}

public class Main extends Base_Abs{
    Scanner scn = new Scanner(System.in);
    public void register(Base_Encap sam){
        System.out.println("==Wellcome new user==");
        System.out.print("Register name: ");
        String name = scn.next();
        
        sam.setName(name); 
        
        System.out.println("=====================");
        System.out.print("Register number: ");
        int number = scn.nextInt();
        
        sam.setNumber(number); 
        
        System.out.println("=====================");
        System.out.print("Register password: ");
        String password = scn.next();
        
        sam.setPass(password); 
        
        System.out.println("=====================");
        System.out.println("Register Successful");
    
    }

}
