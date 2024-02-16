package com.carsSell.carShop.StockCars;

import java.util.Date;

public class StockCars {
	private int carId;
	private String carName;
	private String fuel;
	private Date model;
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
	public StockCars() {
		super();
	}
	public Date getModel() {
		return model;
	}
	public void setModel(Date model) {
		this.model = model;
	}
	public StockCars(int carId, String carName, String fuel, Date model) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.fuel = fuel;
		this.model = model;
	}
	
	
	
	

}
