package com.hybernet.VehicleRentalService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking_table")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	private int carId;
	private int bikeId;
	private int userId;
	private String Address;
	private String LicenseNo;
	private String PickupDate;
	private String DropDate;
	
	public String getPickupDate() {
		return PickupDate;
	}
	public void setPickupDate(String pickupDate) {
		PickupDate = pickupDate;
	}
	public String getDropDate() {
		return DropDate;
	}
	public void setDropDate(String dropDate) {
		DropDate = dropDate;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getLicenseNo() {
		return LicenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		LicenseNo = licenseNo;
	}
	
	
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public Booking( String address, String licenseNo,String pickupDate, String dropDate) {
		super();
		
		Address = address;
		LicenseNo = licenseNo;
		PickupDate = pickupDate;
		DropDate = dropDate;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}
