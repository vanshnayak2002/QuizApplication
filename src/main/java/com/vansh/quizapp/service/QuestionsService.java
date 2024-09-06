package com.vansh.quizapp.service;

import com.vansh.quizapp.dao.QuestionsDao;
import com.vansh.quizapp.model.Question;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
<<<<<<< HEAD
import org.springframework.http.HttpStatusCode;
=======
>>>>>>> backend-branch
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionsService {

    @Autowired
   private QuestionsDao questionsDao;

<<<<<<< HEAD
    public List<Question> getAllQuestions() {
       return new ResponseEntity<>(questionsDao.findAll(), HttpStatus.OK);
=======
    public ResponseEntity<List<Question>> getAllQuestions() {
       try {
           return new ResponseEntity<>(questionsDao.findAll(), HttpStatus.OK);
       }
       catch (Exception e) {
         e.printStackTrace();
       }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
       }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
try {
    return new ResponseEntity<>(questionsDao.findQuestionsByCategory(category), HttpStatus.OK);

}
catch (Exception e) {
    e.printStackTrace();

}
return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {
       questionsDao.save(question);
       try {
           return new ResponseEntity<>("Question added successfully",HttpStatus.OK);
       }
       catch (Exception e) {
         e.printStackTrace();
       }
        return new ResponseEntity<>("Error adding question",HttpStatus.BAD_REQUEST);
            }

    public ResponseEntity<String> deleteQuestion(int id) {
         questionsDao.deleteById(id);
         try {
             return new ResponseEntity<>("Question deleted with id: " + id + " successfully",HttpStatus.OK  );
         } catch (Exception e) {
             e.printStackTrace();
         }
        return new ResponseEntity<>("Error deleting question",HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionsByDifficulty(String difficultyLevel){
        try {
            return new ResponseEntity<>(questionsDao.findQuestionsByDifficultyLevel(difficultyLevel), HttpStatus.OK);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

>>>>>>> backend-branch


}
