package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Company 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String website;
private String location;

@OneToOne
private GST gsts;

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

public String getWebsite() {
	return website;
}

public void setWebsite(String website) {
	this.website = website;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public GST getGsts() {
	return gsts;
}

public void setGsts(GST gsts) {
	this.gsts = gsts;
}

}
