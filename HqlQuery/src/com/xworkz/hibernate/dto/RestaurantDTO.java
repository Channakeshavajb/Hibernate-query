package com.xworkz.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "restaurant_table")
public class RestaurantDTO implements Serializable {

	
	@Id
	@GenericGenerator(name = "anyName", strategy = "increment")
	@GeneratedValue(generator = "anyName")
	@Column(name = "r_id")
	private int rid;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "veg")
	private boolean veg;
	@Column(name = "no_of_rooms")
	private int noOfRooms;

	public RestaurantDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	@Override
	public String toString() {
		return "RestaurantDTO [rid=" + rid + ", name=" + name + ", location=" + location + ", veg=" + veg
				+ ", noOfRooms=" + noOfRooms + "]";
	}
}
