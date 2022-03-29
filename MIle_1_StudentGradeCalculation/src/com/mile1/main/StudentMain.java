package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
    static Student[] data = new Student[9];

    public StudentMain() {
        for(int i =0; i<data.length;i++){
            data[i] = new Student();
        }
        data[0] = new Student("Sekar",new int[]{85,75,95} );
        data[1] = new Student(null,new int[]{11,22,33});
        data[2] = null;
        data[3] = new Student("Manoj",null);
        data[4] = new Student("Ayush Dhiman",new int[]{95,98,99});//TC1
        data[5] = new Student("Aditya",new int[]{35,40,85});//TC2
        data[6] = null;//TC3
        data[7] = new Student(null,new int[]{99,98,97});//TC4
        data[8] = new Student("Ashish",null);//TC5


    }

    public static void main(String[] args) {
        StudentReport studentReport = new StudentReport();
        StudentMain main = new StudentMain();
        for(int i =0 ;i<data.length;i++){
            try {
                if(studentReport.validate(data[i]).equals("VALID")){
                    System.out.println(studentReport.findGrades(data[i]));
                }
            }catch (NullNameException | NullStudentObjectException | NullMarksArrayException e){
                e.printStackTrace();
            }

        }
        StudentService studentService = new StudentService();
        System.out.println("Number of Null Marks Array "+studentService.findNumberOfNullMarksArray(data));
        System.out.println("Number of Null Names "+studentService.findNumberOfNullName(data));
        System.out.println("Number of Null Objects "+studentService.findNumberOfNullObjects(data));

    }
}
