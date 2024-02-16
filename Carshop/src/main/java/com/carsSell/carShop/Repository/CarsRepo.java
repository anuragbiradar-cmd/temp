package com.carsSell.carShop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carsSell.carShop.CarsEntity;

public interface CarsRepo extends JpaRepository<CarsEntity, Integer>{

}
