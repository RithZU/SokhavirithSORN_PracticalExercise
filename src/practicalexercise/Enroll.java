/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalexercise;

import java.util.ArrayList;

/**
 *
 * @author SK_Rith
 */
public class Enroll {
    private Teacher instructor = null;
    private ArrayList<Student> studList;
    private Course course;
    private int semester;
    private int room;
    
    public Enroll(){
        
    }

    /**
     *
     * @param course
     * @param instructor
     * @param studList
     */
    public Enroll(Course course, Teacher instructor, ArrayList<Student> studList){
        this.course = course;
        this.instructor = instructor;
        this.studList = studList;
    }public Enroll(Course course, Teacher instructor, ArrayList<Student> studList,int semester,int room){
        this.course = course;
        this.instructor = instructor;
        this.studList = studList;
        this.semester = semester;
        this.room = room;
    }

    /**
     *
     * @return
     */
    public int getTotalStudents(){
        return studList.size();
    }

    /**
     *
     * @param aStud
     * @return
     */
    public boolean addStudent(Student aStud){
        studList.add(aStud);
        return true;
    }

    /**
     *
     * @param student
     * @return
     */
    public boolean dropStudent(Student student){
        studList.remove(student);
        return true;
    }

    /**
     *
     * @param teacher
     * @return
     */
    public boolean addTeacher(Teacher teacher){
        if(this.instructor==null){
            instructor = teacher;
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public boolean dropTeacher(){
        if(this.instructor!=null){
            instructor = null;
            return true;
            
            
        }
        return false;
    }

    /**
     *
     * @param aCourse
     * @return
     */
    public boolean addCourse(Course aCourse){
        if(this.course==null){
            this.course = aCourse;
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public boolean dropCourse(){
        if(this.course!=null){
            this.course = null;
            return true;
        }
        return false;
    }
    public void display(){
        System.out.println(" + Teacher's Info : ");
        if(instructor ==null){
            System.out.println("No teacher has enrolled yet");
        }
        else
        {
        instructor.printInfo();}
        System.out.println("**************");
        System.out.println(" + Course Info : ");
        course.printInfo();
        System.out.println("**************");
        System.out.println("Student's List : ");
        for(int i=0;i<studList.size();i++){
            
            System.out.println("Student" +(i+1)+" : ");
            System.out.println("-----");
            studList.get(i).printInfo();
        }
        System.out.println("**************");
        System.out.println("Semester : "+semester);
        System.out.println("Room : "+room);
    }
    
}
