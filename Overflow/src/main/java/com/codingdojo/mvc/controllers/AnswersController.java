package com.codingdojo.mvc.controllers;

import com.codingdojo.mvc.services.*;
import com.codingdojo.mvc.models.*;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dusty on 7/21/17.
 */
@Controller
@RequestMapping("/answers")
public class AnswersController {
    AnswerService ansService;
    public AnswersController(AnswerService ansService){
        this.ansService = ansService;
    }

}
