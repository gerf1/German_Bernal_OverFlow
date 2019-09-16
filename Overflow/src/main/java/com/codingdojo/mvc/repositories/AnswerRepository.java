package com.codingdojo.mvc.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.Answer;


@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long>{
}
