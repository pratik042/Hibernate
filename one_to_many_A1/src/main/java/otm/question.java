package otm;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="otm1question")
public class question {

	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	private String quest;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<Answer> answer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	
	
	
	
}
