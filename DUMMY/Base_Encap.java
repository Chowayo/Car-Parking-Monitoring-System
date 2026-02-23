package com.mycompany.fixed_mid_exam;

public class Base_Encap {
    private String name;
    private int number;
    private String password;
    
    String getName(){
        return this.name;
    }
    
    String getPass(){
        return this.password;
    }
    
    int getNumber(){
        return this.number;
    }
    
    
    
    void setName(String name){
        this.name = name;
    }
    
    void setNumber(int number){
        this.number = number;
    }
    
    void setPass(String password){
        this.password = password;
    }
    
}
