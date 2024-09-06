package com.vansh.quizapp.service;

import com.vansh.quizapp.dao.QuestionsDao;
import com.vansh.quizapp.dao.QuizDao;
import com.vansh.quizapp.model.Question;
import com.vansh.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;
    @Autowired
     QuestionsDao questionsDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

   List<Question>questions=questionsDao.findRandomQuestionsByCategory(category,numQ);
    Quiz quiz =  new Quiz();
    quiz.setTitle(title);
    quiz.setQuestion(questions);
    quizDao.save(quiz);

    return new ResponseEntity<>("success", HttpStatus.CREATED);

    }





}
