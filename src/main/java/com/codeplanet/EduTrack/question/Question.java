package com.codeplanet.EduTrack.question;


import com.codeplanet.EduTrack.Exam.Exam;
import com.codeplanet.EduTrack.subject.Subject;
import jakarta.persistence.*;

@Entity
public class Question {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
	  
	  @Column(name="question_name")
	  private String qname;
	  
	  private String optionOne;
	  private String optionTwo;
	  private String optionThree;
	  private String optionFour;
	  
	  @Column(name="question_answer")
	  private String answer;
	  
	   @ManyToOne
	   private Subject sname;
	   
	   @ManyToOne
	   private Exam ename;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public String getOptionOne() {
		return optionOne;
	}

	public void setOptionOne(String optionOne) {
		this.optionOne = optionOne;
	}

	public String getOptionTwo() {
		return optionTwo;
	}

	public void setOptionTwo(String optionTwo) {
		this.optionTwo = optionTwo;
	}

	public String getOptionThree() {
		return optionThree;
	}

	public void setOptionThree(String optionThree) {
		this.optionThree = optionThree;
	}

	public String getOptionFour() {
		return optionFour;
	}

	public void setOptionFour(String optionFour) {
		this.optionFour = optionFour;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Subject getSname() {
		return sname;
	}

	public void setSname(Subject sname) {
		this.sname = sname;
	}

	public Exam getEname() {
		return ename;
	}

	public void setEname(Exam ename) {
		this.ename = ename;
	}
	   
	   
}
