package mto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="detail")
public class detail {

@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)  
	//@Column(name="detail_id")
	private int detailid;
	
	
	@Column(name="location")
	private String location;
	
	
	@OneToOne(cascade = CascadeType.ALL)
//	@Column(name="friend_indetail")
	private friend friend;


	public int getDetailid() {
		return detailid;
	}


	public void setDetailid(int detailid) {
		this.detailid = detailid;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public friend getFriend() {
		return friend;
	}


	public void setFriend(friend friend) {
		this.friend = friend;
	}
	
	
	
}
