package com.example.learnspringjpa.Repository;

import com.example.learnspringjpa.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


     public List<Student> findByFirstNameIgnoreCase(String firstName);

     //JPQL
     //suppose we want to run query other than spring boot predefined ones
     //this synatx makes use of spring boot format
     @Query("select s from Student s where s.email = ?1")
     public List<Student> findByEmail(String email);

     //JPQL Native
     //this syntax makes use of mssql format
     @Query(value = "select * from Student s where guardian_name = ?1",
             nativeQuery = true

     )
     public List<Student> findByGuardianNameNative(String guardian_name);

     //^ we can post and update using @Modifying and @Transactional Annotion using above yntax
}
