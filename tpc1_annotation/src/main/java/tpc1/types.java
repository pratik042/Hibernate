package tpc1;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="types1")
@DiscriminatorValue(value = "types2")
@AttributeOverrides({
		@AttributeOverride(name="bikeid",column = @Column(name="bikeid"))
		,
		@AttributeOverride(name="bikename",column=@Column(name="bikename"))
		
		
})
public class types  extends bikes{
@Column(name = "biketype")
	private String biketype;

	public types(int bikeid, String bikename, String biketype) {
		super(bikeid, bikename);
		this.biketype = biketype;
	}

	public String getBiketype() {
		return biketype;
	}

	public void setBiketype(String biketype) {
		this.biketype = biketype;
	}
	
	
	
	
	
}
