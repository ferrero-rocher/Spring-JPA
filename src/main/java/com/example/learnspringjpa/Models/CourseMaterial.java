package com.example.learnspringjpa.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterial {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Integer courseMaterialId;
    private String courseUrl;
    @OneToOne(
            cascade = CascadeType.ALL            //course material cannot exist wo courseid. Hence 1-1 relation.We do cascade to save course before then coursematerial
    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;
}
