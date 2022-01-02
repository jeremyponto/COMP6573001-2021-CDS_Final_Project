package com.jk.project.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    public List<Student> getAllStudents() {
        return List.of(
                new Student(
                        UUID.randomUUID(),
                        "Jeremy",
                        "Ponto",
                        "jeremyponto01@gmail.com",
                        Student.Gender.MALE
                ),
                new Student(
                        UUID.randomUUID(),
                        "Kevin",
                        "Herman",
                        "kevinherman547@yahoo.com",
                        Student.Gender.MALE
                )
        );
    }

}
