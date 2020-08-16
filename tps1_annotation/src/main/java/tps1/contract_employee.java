package tps1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="contract_employee")
@PrimaryKeyJoinColumn(name ="empid")
public class contract_employee extends employee {

	
	@Column(name="salary")
	private int  salary;
	@Column(name="bonus")
	private int bonus;
	public contract_employee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	public contract_employee(int id, String name, int salary, int bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	
	
	
	
}
