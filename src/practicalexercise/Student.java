/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalexercise;

/**
 *
 * @author SK_Rith
 */
//Student inherit from Person class
public class Student extends Person{
    
    
    
    private int nbAbsents=0;
    private double averageScore=0;
    private boolean eligibleStatus = true;
    
    /**
     *
     */
    public Student(){
        
    }

    /**
     *
     * @param ID
     * @param studName
     * @param phNum
     * @param email
     */
    public Student(int ID, String studName, String phNum, String email){
        
        this.ID = ID;
        this.name = studName;
        this.phoneNumber = phNum;
        this.email = email;
    }
    public Student(int ID, String studName, String phNum, String email,boolean eligibleStatus,double averageScore){
        
        this.ID = ID;
        this.name = studName;
        this.phoneNumber = phNum;
        this.email = email;
        this.eligibleStatus = eligibleStatus;
        this.averageScore = averageScore;
    }

    /**
     *
     * @return
     */
    public boolean is_eligible_to_enroll(){
        return eligibleStatus;
    }

    /**
     *
     * @return
     */
    public double getAverageScore(){
        return averageScore;
    }
    @Override
    public void printInfo(){
        System.out.println("ID : "+ID);
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Number of absents : "+nbAbsents);
        System.out.println("Average Score : "+averageScore);
        System.out.println("Eligible to enroll ? "+eligibleStatus);
        
    }
    
    
}
