package com.vansh.quizapp.controller;

import com.vansh.quizapp.model.Question;
import com.vansh.quizapp.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionsService questionsService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionsService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {

        return questionsService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question) {
       return  questionsService.addQuestion(question);
    }

    @DeleteMapping("delete/{id}")
    public String deleteQuestion(@PathVariable int id) {
        return  questionsService.deleteQuestion(id);
    }
}

