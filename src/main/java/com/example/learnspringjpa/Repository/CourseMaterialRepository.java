package com.example.learnspringjpa.Repository;

import com.example.learnspringjpa.Models.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Integer> {
}
