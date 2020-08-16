package tpc1;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PersistenceUnit;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "BIKES2")

public class bikes {

	
	@Id
	@Column(name="bikeid")
private int bikeid;
	
	@Column(name = "bikename")
 private String bikename;

	public bikes(int bikeid, String bikename) {
		super();
		this.bikeid = bikeid;
		this.bikename = bikename;
	}

	public int getBikeid() {
		return bikeid;
	}

	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
 
	
	
 
	
	
}
