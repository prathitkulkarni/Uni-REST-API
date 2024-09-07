package com.uni.controller;

import com.uni.model.Course;
import com.uni.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping(value = "/course")
    public Course addCourse(@RequestBody Course course){
        Course resultCourse = courseService.addCourse(course);
        return resultCourse;
    }

    @PutMapping(value = "/course/{courseid}")
    public Course editCourse(@RequestBody  Course course, @PathVariable Integer courseid){
        Course resultCourse = courseService.editCourse(course, courseid);
        return resultCourse;
    }

    @DeleteMapping(value = "/course/{courseid}")
    public Course deleteCourse(@PathVariable Integer courseid){
        Course resultCourse = courseService.deleteCourse(courseid);
        return resultCourse;
    }

    @GetMapping(value = "/course/{courseid}")
    public Course find(@PathVariable Integer courseid){
        Course resultCourse = courseService.find(courseid);
        return resultCourse;
    }

    @GetMapping(value = "/courses")
    public List<Course> findAll(){
        List<Course> list = courseService.findAll();
        return list;
    }
}
