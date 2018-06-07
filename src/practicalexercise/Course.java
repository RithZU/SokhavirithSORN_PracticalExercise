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
public class Course {
    
    private int courseID;
    private String courseName;
    private int nbHours;
    private int nbMaxStudentsPerCourse;
    
    public Course(){
        
    }

    /**
     *
     * @param courseID
     * @param courseName
     * @param nbHours
     * @param nbMaxStudentsPerCourse
     */
    public Course(int courseID,String courseName,int nbHours,int nbMaxStudentsPerCourse){
        this.courseID = courseID;
        this.courseName = courseName;
        this.nbHours = nbHours;
        this.nbMaxStudentsPerCourse = nbMaxStudentsPerCourse;
    }
    public void printInfo(){
        System.out.println("Course Id : "+courseID);
        System.out.println("Course Name : "+courseName);
        System.out.println("Number of hours : "+nbHours);
        System.out.println("Max Students : "+nbMaxStudentsPerCourse);
    }
    
}

