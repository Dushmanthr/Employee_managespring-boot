package com.springboot.springbootcrud_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity
@Table(name="employees")
public class Employee {
    @Id 
    private long id;
    private String firstName;
    private String lastName;
    private String email;

}
