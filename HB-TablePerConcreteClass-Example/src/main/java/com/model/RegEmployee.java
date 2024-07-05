package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="regularEmployee102")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})
public class RegEmployee extends Employee{
	private float salary;
	private int bonus;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public RegEmployee() {
		super();
	}
	public RegEmployee(float salary, int bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}
	public RegEmployee(String name, float salary, int bonus) {
		// TODO Auto-generated constructor stub
		super(name);
		this.salary=salary;
		this.bonus=bonus;
	}

}
