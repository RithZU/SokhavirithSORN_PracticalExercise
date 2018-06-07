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
public class Teacher extends Person{
    private int teacherID;
    private int salary;
    public Teacher(){
        
    }

    /**
     *
     * @param ID
     * @param name
     * @param DOB
     * @param salary
     */
    public Teacher(int ID,String name, Date DOB,int salary){
        teacherID = ID;
        this.name = name;
        this.DOB = DOB;
        this.salary = salary;
    }
    @Override
    public void printInfo(){
        System.out.println("ID : "+teacherID);
        System.out.println("Name : "+name);
        System.out.println("Date of birth : "+DOB);
        System.out.println("Salary : "+salary);
    }
}
