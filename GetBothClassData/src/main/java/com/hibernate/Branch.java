package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Branch 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	private String loc;
	private long phno;
	@ManyToOne
	private Jspider jspider;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Jspider getJspider() {
		return jspider;
	}
	public void setJspider(Jspider jspider) {
		this.jspider = jspider;
	}
	
	
}
