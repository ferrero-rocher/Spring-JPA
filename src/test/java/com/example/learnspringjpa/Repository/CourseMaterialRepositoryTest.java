package com.example.learnspringjpa.Repository;

import com.example.learnspringjpa.Models.Course;
import com.example.learnspringjpa.Models.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial()
    {
        Course course = Course.builder()
                .title("DSA")
                .courseCredit(7)
                .build();



        CourseMaterial courseMaterial = CourseMaterial.builder()
                .courseUrl("www.google.com")
                .course(course)
                .build();

        this.courseMaterialRepository.save(courseMaterial);
    }

}