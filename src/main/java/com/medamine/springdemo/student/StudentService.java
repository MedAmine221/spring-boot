package com.medamine.springdemo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService
{
    public List<Student> findAllStudents()
    {
        return List.of(
                new Student("med","amine", LocalDate.now(),"contact@gmail.com",21),
                new Student("dian","hattab",LocalDate.now(),"contact@gmail.com",21)
        );
    }


}
