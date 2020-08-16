package tpc2;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="car_type")
@AttributeOverrides({
	@AttributeOverride(name="carid",column =@Column(name="carid")),
	@AttributeOverride(name="carname",column =@Column(name="carname")),
	

})

public class car_type extends car {

	
	@Column(name="type")
private String type;

	public car_type(int carid, String carname, String type) {
		super(carid, carname);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	

	
	
	
	
}
