package com.masai.service;

import com.masai.model.Student;

public interface UniversityService {

     Student findStudentById(int id);
     String saveStudent(Student student);
     String deleteStudentById(int id);
     String updateStudentCGPA(int id, int cgpa);
}
