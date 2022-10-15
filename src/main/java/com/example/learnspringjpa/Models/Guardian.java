package com.example.learnspringjpa.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
/*
@AttributeOverrides({
        @AttributeOverride(
                name = "Name",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "Email",
                column = @Column(name = "guardian_email")
        ),
        @AttributeOverride(
                name = "Number",
                column = @Column(name = "guardian_number")
        )
})
*/

public class Guardian {
    @Column(name = "guardian_name")
    private String Name;
    @Column(name = "guardian_email")
    private String Email;
    @Column(name = "guardian_number")
    private String Number;
}
