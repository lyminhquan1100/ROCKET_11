package com.vti.company.enity.Encapsulation;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float score;
    private String grade;
    private float point;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getHometown() {
        return hometown;
    }

    public void setScore(float score, Scanner scan) {
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public Student() {

    }

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.score = 0;
    }

    public void plusPoint(Scanner scan) {
        System.out.printf("Nhap so diem cong: ");
        this.point = Float.parseFloat(scan.nextLine());
        this.score += point;
    }

    public String getGrade() {
        return grade;
    }

    public void enterStudent(Scanner scan) {
        System.out.printf("Nhap ten cua hoc sinh: ");
         this.name = scan.nextLine();
        System.out.printf("Nhap diem cua hoc sinh: ");
         this.score = Float.parseFloat(scan.nextLine());
    }

//    public void evaluate() {
//        if(this.score <4.0) {
//            System.out.println("Xep loai yeu");
//        } else if(this.score<6.0) {
//            System.out.println("Xep loai trung binh");
//        } else if(this.score<8.0) {
//            System.out.println("Xep loai kha");
//        } else {
//            System.out.println("Xep loai gioi");
//        }
//    }

    public void evalute() {
        if(this.score <4.0) {
            this.grade = "yeu";
        } else if(this.score<6.0) {
            this.grade = "trung binh";
        } else if(this.score<8.0) {
            this.grade = "kha";
        } else {
            this.grade = "gioi";
        }
    }
//
    public void print(){
        System.out.print(name + " Xep loai " + grade);
    }


//    @Override
//    public String toString() {
//        if (this.score < 4.0) {
//            this.grade = "yeu";
//        } else if (this.score < 6.0) {
//            this.grade = "trung binh";
//        } else if (this.score < 8.0) {
//            this.grade = "kha";
//        } else {
//            this.grade = "gioi";
//        }
//        return name + " xep loai " + grade;
//    }
}
