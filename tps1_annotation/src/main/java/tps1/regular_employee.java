package tps1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="regular_employee")
@PrimaryKeyJoinColumn(name ="empid")
public class regular_employee  extends employee{

	
	@Column(name="duration")
	private int duration;

	public regular_employee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public regular_employee(int id, String name, int duration) {
		super(id, name);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	
	
	
	
	
	
}
