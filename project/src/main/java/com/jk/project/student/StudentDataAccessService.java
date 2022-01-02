package com.jk.project.student;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class StudentDataAccessService {

    public List<Student> selectAllStudents() {
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
