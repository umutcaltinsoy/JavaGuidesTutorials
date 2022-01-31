package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Umut", "Altinsoy");
    }

    @GetMapping("/students")
    // Returns List as JSON Array
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Umut", "Cagri"));
        students.add(new Student("Floyd", "Mayweather"));
        students.add(new Student("Mike", "Tyson"));
        students.add(new Student("Leo", "Dicaprio"));
        students.add(new Student("Ramesh", "Fadatare"));
        return students;
    }

    // http://localhost:8080/student/1
    // @PathVariable annotation
    @GetMapping("student/{firstName}/{lastName}/")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }

    // build rest API to handle query parameters
    // http://localhost:8080/student?firstName=Umut&lastName=Altinsoy
    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}
