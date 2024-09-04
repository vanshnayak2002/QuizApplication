package com.vansh.quizapp.dao;

import com.vansh.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsDao extends JpaRepository<Question, Integer> {

List<Question> findQuestionsByCategory(String category);

}
