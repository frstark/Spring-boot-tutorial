package com.dailycodebuffer.Springboot.tutorial.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Angestellter {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long AngId;

    @Size(min = 2)
    private String firstName;

    @Size(min = 2)
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY
            /*optinal = false*/)
    @JoinColumn(
            name = "department_id",
            referencedColumnName = "departmentId"
    )
    private Department department;


}
