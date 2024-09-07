package com.uni.service;

import com.uni.model.Course;

import java.util.List;

public interface ICourseService {
    public Course addCourse(Course course);
    public Course editCourse(Course course, Integer courseid);
    public Course deleteCourse(Integer courseid);
    public Course find(Integer courseid);
    public List<Course> findAll();
}
