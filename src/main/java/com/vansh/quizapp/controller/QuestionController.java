package com.vansh.quizapp.controller;

import com.vansh.quizapp.model.Question;
import com.vansh.quizapp.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionsService questionsService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionsService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionsService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
       return  questionsService.addQuestion(question);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable int id) {
        return  questionsService.deleteQuestion(id);
    }

    @GetMapping("difficulty/{difficultyLevel}")
    public ResponseEntity<List<Question>> getQuestionsByDifficulty(@PathVariable String difficultyLevel) {

        return  questionsService.getQuestionsByDifficulty(difficultyLevel);
    }


}

