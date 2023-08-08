package com.msil.relationsnew.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Department_db")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dept_id;
    private String dept_name;

    @OneToOne(mappedBy = "department")
    private Student student;
}
