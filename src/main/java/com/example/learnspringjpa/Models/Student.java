package com.example.learnspringjpa.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.ws.spi.WebServiceFeatureAnnotation;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table( name = "student",
        uniqueConstraints = @UniqueConstraint(
                name="emailid-unique",
                columnNames = "email"
        )
)

public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO

    )
    private Integer studentId;
    public String firstName;
    private String lastName;
    private String email;

    @Embedded
    private Guardian guardian;



}
