package com.company.prac6;

import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Student> {

    public static void main(String[] args) {
        Comparator<Student> comparator = new SortingStudentByGPA();
        Student[] students = {new Student(10), new Student(7), new Student(10),new Student(15)};

        students = qsort(students, 0, students.length-1, comparator);
        for (Student student: students) {
            System.out.println(student.getGPA());
        }
    }
    public static Student[] qsort(Student[] array, int left, int right, Comparator<Student> comp) {
        int ll=left;
        int rr=right;
        if (rr>ll){
            Student pivot = array[(ll+rr)/2];
            while (ll <=rr){
                while(ll<right && comp.compare(array[ll], pivot) < 0){
                    ll +=1;
                }
                while(rr>left &&  comp.compare(array[rr], pivot) > 0){
                    rr -=1;
                }
                if (ll <=rr){
                    Student temp = array[ll];
                    array[ll] = array[rr];
                    array[rr] = temp;
                    ll +=1;
                    rr -=1;
                }
            }
            if (left < rr){
                qsort(array,left,rr, comp);

            }
            if (ll<right){
                qsort(array, ll, right, comp);
            }
        }
        return array;
    }

    @Override
    public int compare(Student s1, Student s2) {
        return s2.getGPA() - s1.getGPA();
    }

}
