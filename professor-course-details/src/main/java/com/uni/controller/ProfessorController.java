package com.uni.controller;

import com.uni.model.Professor;
import com.uni.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping(value = "/professor")
    public Professor addProfessor(@RequestBody  Professor professor){
        Professor result = professorService.addProfessor(professor);
        return result;
    }

    @PutMapping(value = "professor/{professorid}")
    public Professor editProfessor(@RequestBody Professor professor, @PathVariable Integer professorid){
        Professor result = professorService.editProfessor(professor, professorid);
        return result;
    }

    @DeleteMapping(value = "professor/{professorid}")
    public Professor deleteProfessor(@PathVariable Integer professorid){
        Professor result = professorService.deleteProfessor(professorid);
        return result;
    }

    @GetMapping(value = "professor/{professorid}")
    public Professor find(@PathVariable Integer professorid){
        Professor result = professorService.find(professorid);
        return result;
    }

    @GetMapping(value = "/professors")
    public List<Professor> findAll(){
        List<Professor> list = professorService.findAll();
        return list;
    }
}
