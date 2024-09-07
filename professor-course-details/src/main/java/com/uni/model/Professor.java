package com.uni.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "professor")
public class Professor {

    @Id
    @Column(name = "professorid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer professorid;

    @Column(name = "name")
    private String name;

    @ManyToMany
    private List<Course> courses = new ArrayList<>();

    public Professor() {
    }

    public Professor(String name) {
        this.name = name;
    }

    public Integer getProfessorid() {
        return professorid;
    }

    public void setProfessorid(Integer professorid) {
        this.professorid = professorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> list) {
        this.courses = list;
    }
}
