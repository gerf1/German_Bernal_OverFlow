package com.codingdojo.mvc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import com.codingdojo.mvc.models.*;
import com.codingdojo.mvc.repositories.*;

@Service
public class TagService {
    TagRepository tagRepo;
    public TagService(TagRepository tagRepo){
        this.tagRepo = tagRepo;
    }
    public Iterable<Tag> getAll(){
        return tagRepo.findAll();
    }
    public Optional<Tag> getById(Long id){
        return tagRepo.findById(id);
    }
    public void saveTag(Tag tag){
        tagRepo.save(tag);
    }
    public Tag findBySubject(String subject){
        return tagRepo.findBySubjectEquals(subject);
    }
}
