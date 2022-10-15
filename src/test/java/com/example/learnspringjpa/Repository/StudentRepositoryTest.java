package com.example.learnspringjpa.Repository;

import com.example.learnspringjpa.Models.Guardian;
import com.example.learnspringjpa.Models.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;


//this annotation is used for testing purpose and db is affected
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;


    @Test
    public void saveStudent()
    {

 //we'll use builder method since we have added that in student class.This is the syntax
        Student student = Student.builder()
                .email("abc@gmail.com")
                .firstName("shaun")
                .lastName("lewis")
                //.guardianName("Guard")
                //.guardianNumber("12345")
                //.guardianEmail("abc@gmail.com")
                .build();

        this.studentRepository.save(student);
    }

    @Test
    public void getAllStudents()
    {
        List<Student> studentlist = this.studentRepository.findAll();
        System.out.println(studentlist.toString());
    }

    @Test
    public void saveStudentWithGuardianEntity()
    {

        Guardian guardian = new Guardian("Jon Snow","jon@snow.com","12345");


        Student student = Student.builder()
                .email("chitty@gmail.com")
                .firstName("robot")
                .lastName("chitty")
                .guardian(guardian)
                .build();

        this.studentRepository.save(student);

    }

    @Test
    public  void findStudentByName()
    {
        List<Student> studentList = this.studentRepository.findAll();
        List<Student>ans= (studentList.stream().
                filter(student -> student.getFirstName().equals("Shaun"))).collect(Collectors.toList());


        System.out.println(ans);
    }

    @Test
    public void findStudentByNameCase()
    {
        List<Student> ans = studentRepository.findByFirstNameIgnoreCase("Shaun");
        System.out.println(ans);
    }

    @Test
    public void printStudentByEmail()
    {
     List<Student> ans = studentRepository.findByEmail("abc@gmail.com");
        System.out.println(ans);
    }

    @Test
    public void printStudentByGuardianName()
    {
        List<Student> ans = studentRepository.findByGuardianNameNative("Guard");
        System.out.println(ans);
    }

}