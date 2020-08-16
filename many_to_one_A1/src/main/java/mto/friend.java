package mto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "friend_table")
public class friend {

	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name="id")
	private int id;
	
	@Column(name="friend_name")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
//	@Column(name="detail_infrnd")
	private detail detail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public detail getDetail() {
		return detail;
	}

	public void setDetail(detail detail) {
		this.detail = detail;
	}
	
	
	
	
}
