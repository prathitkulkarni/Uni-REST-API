package com.uni.repository;

import com.uni.model.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends CrudRepository<Professor,Integer> {
}
