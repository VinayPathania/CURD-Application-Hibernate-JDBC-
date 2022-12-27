package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    private String email;
    private String address;
    private int cgpa;

    public Student() {
    }

    public Student(String email, String address, int cgpa) {
        this.email = email;
        this.address = address;
        this.cgpa = cgpa;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
