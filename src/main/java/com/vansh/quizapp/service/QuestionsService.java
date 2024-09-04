package com.vansh.quizapp.service;

import com.vansh.quizapp.dao.QuestionsDao;
import com.vansh.quizapp.model.Question;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionsService {

    @Autowired
   private QuestionsDao questionsDao;

    public List<Question> getAllQuestions() {
       return  ResponseEntit<>(questionsDao.findAll().getSa);

    }

    public List<Question> getQuestionsByCategory(String category) {

        return  questionsDao.findQuestionsByCategory(category);
    }

    public String addQuestion(Question question) {
       questionsDao.save(question);
        return "Question added successfully";
    }

    public String deleteQuestion(int id) {
         questionsDao.deleteById(id);
       return "Question deleted with id: " + id + " successfully";


    }

}
