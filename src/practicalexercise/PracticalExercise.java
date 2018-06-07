/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalexercise;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author SK_Rith
 */
public class PracticalExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date teacherDOB = new GregorianCalendar(1993, Calendar.FEBRUARY, 11).getTime();
        Teacher instructor = new Teacher(001,"Dara",teacherDOB,1000);
        Course course = new Course(010,"Java",70,30);
        ArrayList studentList = new ArrayList<Student>();
        studentList.add(new Student(100,"Virith","010010010","virith@gmail.com",true,70));
        studentList.add(new Student(100,"Vira","010010011","vira@gmail.com",true,90));
        studentList.add(new Student(100,"Viru","010010015","viru@gmail.com",false,80));
        
        Enroll enr1 = new Enroll(course,instructor,studentList,2,202);
        enr1.display();
        
        
    }
    
}
