package com.codingdojo.mvc.services;

import com.codingdojo.mvc.models.*;
import com.codingdojo.mvc.repositories.*;

import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class QuestionService {
    QuestionRepository questionRepository;
    QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }
    public Iterable<Question> getAll(){
        return questionRepository.findAll();
    }
    public Optional<Question> getById(Long id){
        return questionRepository.findById(id);
    }
    public void saveQuestion(Question question){
        questionRepository.save(question);
    }

}
