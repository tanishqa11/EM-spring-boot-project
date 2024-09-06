package com.tanishqagarg.em_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data     // to be geeting from the  user 
@Entity  //to indentify as entity so that these name can be used as column header 
@Table(name="Emp_DB") // will create a table on its own with below headers 
public class EmployeeEntity {
    
    @Id//to make it primary key
    @GeneratedValue(strategy = GenerationType.AUTO)   //to Automaticaly assign data to id thatis 1,2,3,4 and so on
    private Long id;

    private String name;
    private String phone;
    private String email;
    
}
