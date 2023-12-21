package com.hybernet.VehicleRentalService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_table")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int car_id;
	private String car_name;
	private String car_registration_number;
	private String car_color;
	private int car_Seat_no;
	
	
	
	
	public Car(int car_id, String car_name, String car_registration_number, String car_color, int car_Seat_no) {
		super();
		this.car_id = car_id;
		this.car_name = car_name;
		this.car_registration_number = car_registration_number;
		this.car_color = car_color;
		this.car_Seat_no = car_Seat_no;
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_registration_number() {
		return car_registration_number;
	}
	public void setCar_registration_number(String car_registration_number) {
		this.car_registration_number = car_registration_number;
	}
	public String getCar_color() {
		return car_color;
	}
	public void setCar_color(String car_color) {
		this.car_color = car_color;
	}
	public int getCar_Seat_no() {
		return car_Seat_no;
	}
	public void setCar_Seat_no(int car_Seat_no) {
		this.car_Seat_no = car_Seat_no;
	}
	




	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
