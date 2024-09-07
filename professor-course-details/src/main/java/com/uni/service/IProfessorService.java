package com.uni.service;

import com.uni.model.Professor;

import java.util.List;

public interface IProfessorService {
    public Professor addProfessor(Professor professor);
    public Professor editProfessor(Professor professor, Integer professorid);
    public Professor deleteProfessor(Integer professorid);
    public Professor find(Integer professorid);
    public List<Professor> findAll();
}
