package com.example.Springboot_Custom_Annotation.Entity;

import com.example.Springboot_Custom_Annotation.Validation.AddressValidation;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity(name="stu_info")
public class Student
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    @NotNull
    String name;
    @AddressValidation(message="put a valid address")
    String address;
    @Min(18)
    @Max(25)
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
