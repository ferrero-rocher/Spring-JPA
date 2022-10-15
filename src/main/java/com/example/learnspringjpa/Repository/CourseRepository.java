package com.example.learnspringjpa.Repository;

import com.example.learnspringjpa.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
