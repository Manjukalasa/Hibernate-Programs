package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity                                                   // table created Automatically
public class Employee 
{
	@Id                                                  // primary key generated Automatically
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // it is automatically generated Id
	private int id;
	@Column(nullable = false,name="e_name")              // not allow null value & changing column name
	private String name;
	@Column(name="e_age")                                //changing column name
	private int age;
	@Column(length = 6)                                  // Restrication to length gender  will be less then 6
	private String gender;     
	private int sal;
	@Column(unique = true)                               // Allow unique valuse(not allow Duplicates)
	private long phno;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public long getPhno() {
		return phno;
	}
	public void setPnno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", sal=" + sal + ", phno="
				+ phno + "]";
	}
}
