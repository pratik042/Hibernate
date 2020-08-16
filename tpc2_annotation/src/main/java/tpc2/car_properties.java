package tpc2;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="car_properties")
@AttributeOverrides({
	@AttributeOverride(name="carid",column = @Column(name="carid")),
	@AttributeOverride(name="carname",column=@Column(name="carname"))

})
public class car_properties extends car {

	
	@Column(name="property")
	private String property;

	public car_properties(int carid, String carname, String property) {
		super(carid, carname);
		this.property = property;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
	
	
	
	
}
