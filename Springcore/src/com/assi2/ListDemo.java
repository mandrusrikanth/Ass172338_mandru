package com.assi2;

import java.util.Set;
import java.util.List;

public class ListDemo {

	private Set<Question> answers;

	public Set<Question> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Question> answers) {
		this.answers = answers;
	}
	public void show()
	{
		for(Question s:answers)
		{
			System.out.println(s.getQuestion()+" "+s.getAnswer());
		}
	}
}
