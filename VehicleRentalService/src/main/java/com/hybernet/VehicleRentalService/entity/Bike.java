package com.hybernet.VehicleRentalService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike_table")
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bike_id;
	private String bike_name;
	private String bike_registration_number;
	private String bike_color;
	public int getBike_id() {
		return bike_id;
	}
	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public String getBike_registration_number() {
		return bike_registration_number;
	}
	public void setBike_registration_number(String bike_registration_number) {
		this.bike_registration_number = bike_registration_number;
	}
	public String getBike_color() {
		return bike_color;
	}
	public void setBike_color(String bike_color) {
		this.bike_color = bike_color;
	}
	public Bike(int bike_id, String bike_name, String bike_registration_number, String bike_color) {
		super();
		this.bike_id = bike_id;
		this.bike_name = bike_name;
		this.bike_registration_number = bike_registration_number;
		this.bike_color = bike_color;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
