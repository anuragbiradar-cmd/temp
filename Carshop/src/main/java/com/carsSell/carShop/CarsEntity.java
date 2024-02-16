package com.carsSell.carShop;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cars")
public class CarsEntity {
	@Id
	private int carId;
	private String carName;
	private String fuel;
	private Date model;
	@Override
	public String toString() {
		return "CarsEntity [carId=" + carId + ", carName=" + carName + ", fuel=" + fuel + ", model=" + model + "]";
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public Date getModel() {
		return model;
	}
	public void setModel(Date model) {
		this.model = model;
	}
	
}