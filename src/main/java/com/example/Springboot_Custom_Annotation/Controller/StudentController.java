package com.example.Springboot_Custom_Annotation.Controller;

import com.example.Springboot_Custom_Annotation.Entity.Student;
import com.example.Springboot_Custom_Annotation.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController
{
    @Autowired
    StudentRepository srepo;
    @GetMapping("/test")
    public String test()
    {
        return "test for custom annotation";
    }
    @PostMapping("/save")
    public String saveData (@RequestBody Student std )
    {
        srepo.save(std);
        return "data has been saved";
    }
    @GetMapping ("/all")
    public List<Student> allData()
    {
        return srepo.findAll();
    }
    @GetMapping ("/{id}")
    public Optional<Student> byId(@PathVariable int id)
    {
        return srepo.findById(id);
    }
    @GetMapping ("/name/{name}")
    public Optional<Student> byName(@PathVariable String name)
    {
       return srepo.findByName(name);
    }
    @PutMapping ("/update/{id}")
    public String update(@RequestBody Student std,@PathVariable int id)
    {
        Student s=srepo.findById(id).get();
        s.setName(std.getName());
        s.setAge(std.getAge());
        s.setAddress(std.getAddress());
        srepo.save(s);
        return "data has been updated";
    }

}
