/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalexercise;

import java.util.Date;

/**
 *
 * @author SK_Rith
 */
//Person class
public class Person {
    
    protected int ID;
    protected String name;
    protected Date DOB;
    protected String address;
    protected String phoneNumber;
    protected String email;
    //constructor
    public Person(){
        
    }

    /**
     *
     * @param ID
     * @param name
     * @param DOB
     * @param address
     * @param phoneNumber
     * @param email
     */
    public Person(int ID, String name, Date DOB, String address, String phoneNumber,String email){
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    //print the person information
    public void printInfo(){
        System.out.println("Id : "+ID);
        System.out.println("Name : "+name);
        System.out.println("Date of birth : "+DOB);
        System.out.println("Address : "+address);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Email : "+email);
    }
    
}
