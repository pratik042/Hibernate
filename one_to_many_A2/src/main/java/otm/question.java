package otm;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="otm2question")
public class question {

	@Id
	@Column(name = "questid")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
		
	@Column(name="question")
	private String question;

	//@ManyToMany(cascade = CascadeType.ALL)
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="que_id")  
	@OrderColumn(name = "question") 
	private List<answer> answer;
//	public question(int id, String question) {
//		super();
//		this.id = id;
//		this.question = question;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<answer> answer) {
		this.answer = answer;
	}

	
	

}
