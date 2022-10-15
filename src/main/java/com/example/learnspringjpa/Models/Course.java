package com.example.learnspringjpa.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
        @Id
        @GeneratedValue(
                strategy = GenerationType.AUTO
        )
        private Integer courseId;
        private String title;
        private Integer courseCredit;
}
