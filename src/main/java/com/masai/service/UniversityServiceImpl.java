package com.masai.service;

import com.masai.model.Student;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class UniversityServiceImpl implements UniversityService{

    EntityManager em = EMUtil.provideEntityManager();

    @Override
    public Student findStudentById(int id) {
        return em.find(Student.class,id);
    }

    @Override
    public String saveStudent(Student student) {
       if(student!=null){
           em.getTransaction().begin();
           em.persist(student);
           em.getTransaction().commit();
           em.close();
           return student.toString();
       }
       else return "Please provide correct student details";

    }

    @Override
    public String deleteStudentById(int id) {
        Student std = em.find(Student.class,id);
        if(std!=null){
            em.getTransaction().begin();
            em.remove(std);
            em.getTransaction().commit();
            em.close();
            return "Student deleted";
        }
        else return "Please provide correct student id";
    }

    @Override
    public String updateStudentCGPA(int id, int cgpa) {
        Student std = em.find(Student.class,id);
        if(std!=null){
            em.getTransaction().begin();
            std.setCgpa(cgpa);
            em.persist(std);
            em.getTransaction().commit();
            em.close();
            return std.toString();
        }
        else return "Please provide correct student id";
    }
}
