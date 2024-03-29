package com.carsSell.carShop.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsSell.carShop.CarsEntity;
import com.carsSell.carShop.Service.ServiceLogic;
import com.carsSell.carShop.StockCars.StockCars;

@RestController
@RequestMapping("/cars")
public class ControllerClass {
	@Autowired
	ServiceLogic service;
	
	@PostMapping("/postCars")
	public ResponseEntity PostCars(@RequestBody List<StockCars> cars) {
	
	List<CarsEntity> carsList=new ArrayList<CarsEntity>();
	for(StockCars s:cars) {
	CarsEntity ent=new CarsEntity();
	ent.setCarId(s.getCarId());
	ent.setCarName(s.getCarName());
	ent.setFuel(s.getFuel());
     carsList.add(ent);
	}
	System.out.println(carsList);
    ResponseEntity postCars = service.PostCars(carsList);
	return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/stock/{id}")
	public StockCars getAllCars(@PathVariable int id){
		StockCars allCars = service.getbyId(id);
		return allCars;
	}

}
