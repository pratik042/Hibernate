package tpc2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="car")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class car {

	@Id//this is primary key
	@Column(name="carid")
	private int carid;
	
	@Column(name= "carname")
	private String carname;

	public car(int carid, String carname) {
		super();
		this.carid = carid;
		this.carname = carname;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	
	
	
}
