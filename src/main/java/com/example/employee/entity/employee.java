package com.example.employee.entity;

import org.springframework.data.repository.cdi.Eager;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees")
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //work as primary key
    private Long id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name="last_name") //to give column name in table 
    private String lastname;

    @Column(name = "email_id",nullable = false ,unique = true)
    private String email;

}
