package otm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="otm1Answer")
public class Answer {

	@Id
	@Column(name = "id")
	// @JoinColumn(name="cart_id", nullable=false)
	private int id;
	
	// @JoinColumn(name="cart_id", nullable=false)
	private String Answer;
	
	private String Postedby;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public String getPostedby() {
		return Postedby;
	}

	public void setPostedby(String postedby) {
		Postedby = postedby;
	}
	
	
	
	
}
