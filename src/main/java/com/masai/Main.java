package com.masai;

import com.masai.model.Student;
import com.masai.service.UniversityServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UniversityServiceImpl usi = new UniversityServiceImpl();

        System.out.println("=======================================================================");
        System.out.println("Welcome to the University service application");
        System.out.println("=======================================================================");
        System.out.println();
        System.out.println("Press 1 to save student");
        System.out.println("press 2 to find student by its id");
        System.out.println("press 3 to update cgpa of student");
        System.out.println("Press 4 to delete the student");
        System.out.println("=======================================================================");
        System.out.println("Enter your choice");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Enter student email");
            String email = sc.next();
            System.out.println("Enter address");
            String address = sc.next();
            System.out.println("Enter cgpa of student");
            int cgpa = sc.nextInt();
            Student std = new Student(email,address,cgpa);
            System.out.println(usi.saveStudent(std));
        } else if (n==2) {
            System.out.println("Please enter the student id");
            int id = sc.nextInt();
            System.out.println(usi.findStudentById(id));
        } else if (n==3) {
            System.out.println("Please enter the student id");
            int id = sc.nextInt();
            System.out.println("Please enter the new cgpa");
            int cgpa = sc.nextInt();
            System.out.println(usi.updateStudentCGPA(id,cgpa));
        } else if (n==4) {
            System.out.println("Enter student id");
            int id = sc.nextInt();
            System.out.println(usi.deleteStudentById(id));

        }


    }
}