package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {
    public String findGrades(Student studentObject) {
        int sum = 0;
        for (int i = 0; i < studentObject.getMarks().length; i++) {
            if (studentObject.getMarks()[i] <= 35) {
                return "F";
            } else {
                sum += studentObject.getMarks()[i];
            }
        }
        if (sum <= 150) {
            return "C";
        } else if (sum <= 200) {
            return "B";
        } else if (sum <= 250) {
            return "A";
        } else {
            return "A+";
        }
    }


    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
        if (s == null) {
            throw new NullStudentObjectException();
        } else {
            if (s.getName() == null) {
                throw new NullNameException();
            } else if (s.getMarks() == null) {
                throw new NullMarksArrayException();
            } else {
                return "VALID";
            }
        }
    }
}
