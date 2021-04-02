package com.vti.company.backend;

import com.vti.company.enity.Encapsulation.Student;

import java.util.Scanner;

public class Encapsulation {
    public void question1() {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        student.enterStudent(scan);
        student.plusPoint(scan);
        student.evalute();
        student.print();


    }

}
