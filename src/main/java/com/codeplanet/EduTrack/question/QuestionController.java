package com.codeplanet.EduTrack.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class QuestionController {
   
	 @Autowired
	  private QuestionRepository questionRepository; 
	   
	   
	 //to show all question present in database
	 @GetMapping("/question")
	 public List<Question> getAllQuestion(){
		 return (List<Question>) this.questionRepository.findAll(); 
	 }
	 
	
	 //add a question in a particular exam   
	 @PostMapping("/question")
	 public Question addNewQuestion(@RequestBody Question question ){
		 return this.questionRepository.save(question); 
	 }
	 
	 
	 //to get details of all question of that particular exam   (ofcourse using exam_id)  
	 @GetMapping("/exam/{id}/question")
	 public List<Question> getAllQuestionForExam(@PathVariable("id") int id){
		 return this.questionRepository.findByEnameId(id);
	 }
	 
	 
	 //edit a question in a particular exam
	 @PutMapping("/question/{id}")
	  public Question updateQuestion(@PathVariable("id") int id , @RequestBody Question question) {
	  	   	 question.setId(id);
		  return this.questionRepository.save(question); 
	  }
	 
	 
	 // delete a question in a particular exam
	 @DeleteMapping("/question/{id}")
	 public void deleteQuestion(@PathVariable("id") int id) {
		 this.questionRepository.deleteById(id);
	 }
	 
	 
}
