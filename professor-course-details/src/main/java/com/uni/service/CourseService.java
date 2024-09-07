package com.uni.service;

import com.uni.model.Course;
import com.uni.repository.CourseRepository;
import com.uni.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public Course addCourse(Course course) {
        courseRepository.save(course);
        return course;
    }

    @Override
    public Course editCourse(Course course, Integer courseid) {
        courseRepository.save(course);
        return course;
    }

    @Override
    public Course deleteCourse(Integer courseid) {
        Course course = courseRepository.findById(courseid).get();
        courseRepository.deleteById(courseid);
        return course;
    }

    @Override
    public Course find(Integer courseid) {
        Course course = courseRepository.findById(courseid).get();
        return course;
    }

    @Override
    public List<Course> findAll() {
        List<Course> list = (List<Course>) courseRepository.findAll();
        return list;
    }
}
