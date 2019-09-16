package com.codingdojo.mvc.services;

import com.codingdojo.mvc.controllers.*;
import com.codingdojo.mvc.repositories.*;
import com.codingdojo.mvc.models.*;

import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class AnswerService {
    AnswerRepository ansRepo;
    public AnswerService(AnswerRepository ansRepo){
        this.ansRepo = ansRepo;
    }
    public Iterable<Answer> getAll(){
        return ansRepo.findAll();
    }
    public Optional<Answer> getById(Long id){
        return ansRepo.findById(id);
    }
    public void saveAnswer(Answer answer){
        ansRepo.save(answer);
    }
}
