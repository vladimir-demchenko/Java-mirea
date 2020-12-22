package com.company.prac9;

import java.util.ArrayList;

class Student {
    private int GPA;
    private String name;
    Student(String name, int GPA) {
        this.name = name;
        this.GPA=GPA;
    }
    int getGPA() {return GPA;}
    String getName() {return name;}

    public static Student findStudent(String name, Student[] students) throws StudentNotFoundException {
        Student temp_st = null;
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                temp_st = student;
                found = true;
            }
        }
        if (found) {
            return temp_st;
        }
        else throw new StudentNotFoundException("No such student");
    }
}