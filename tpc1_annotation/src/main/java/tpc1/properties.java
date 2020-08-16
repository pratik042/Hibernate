package tpc1;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "properties1")
@DiscriminatorValue(value = "properties2")
@AttributeOverrides({
	@AttributeOverride(name="bikeid",column = @Column(name="bikeid")),
	@AttributeOverride(name="bikename",column=@Column(name="bikename"))	
})
public class properties extends bikes {
@Column(name="bikecc")
	private int bikecc;

public properties(int bikeid, String bikename, int bikecc) {
	super(bikeid, bikename);
	this.bikecc = bikecc;
}

public int getBikecc() {
	return bikecc;
}

public void setBikecc(int bikecc) {
	this.bikecc = bikecc;
}
	

	
	
	
	
	
	
	
	
	
}
