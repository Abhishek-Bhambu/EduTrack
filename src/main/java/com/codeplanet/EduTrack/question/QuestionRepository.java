package com.codeplanet.EduTrack.question;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {
	
	public List<Question> findByEnameId(int id);

}
