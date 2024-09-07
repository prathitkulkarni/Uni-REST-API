package com.uni.service;

import com.uni.model.Course;
import com.uni.model.Professor;
import com.uni.repository.CourseRepository;
import com.uni.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorService implements IProfessorService{

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Professor addProfessor(Professor professor) {
        List<Course> managedCourses = new ArrayList<>();
        for(Course course: professor.getCourses()){
            Course existingCourse = courseRepository.findById(course.getCourseid()).get();
            managedCourses.add(existingCourse);
        }
        professor.setCourses(managedCourses);
        professorRepository.save(professor);
        return professor;
    }

    @Override
    public Professor editProfessor(Professor professor, Integer professorid) {
        professorRepository.save(professor);
        return professor;
    }

    @Override
    public Professor deleteProfessor(Integer professorid) {
        Professor professor = professorRepository.findById(professorid).get();
        professorRepository.deleteById(professorid);
        return professor;
    }

    @Override
    public Professor find(Integer professorid) {
        Professor professor = professorRepository.findById(professorid).get();
        return professor;
    }

    @Override
    public List<Professor> findAll() {
        List<Professor> list = (List<Professor>) professorRepository.findAll();
        return list;
    }
}
