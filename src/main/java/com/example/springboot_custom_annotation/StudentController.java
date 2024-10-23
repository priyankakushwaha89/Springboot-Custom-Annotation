package com.example.springboot_custom_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    StudentRepository srepo;

    @RequestMapping("/test")
    public String test()
    {
        return "application for Custom Annotation";
    }
    @RequestMapping("/save")
    public String saveData(@RequestBody Student student)
    {
        srepo.save(student);
        return "data is saved";
    }
    @RequestMapping("/all")
    public List<Student> allData()
    {
        return srepo.findAll();
    }
//    @RequestMapping("/{id}")
//    public Optional<Student> byId(@PathVariable int id)
//    {
//
//    }
}
