package com.jsp.cars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.cars.dao.CarDao;
import com.jsp.cars.entity.Car;

@Component
public class CarService {
	@Autowired
	private CarDao carDao;
	public CarService()
	{
		
	}
	 public Car saveCar(Car car)
	 {
		 if (car!=null) {
			  this.carDao.savecar(car);
			  return car;
			
		} else {
			return null;

		}
		
	 }
	 public Car findCar(int id)
	 {
		return this.carDao.findCarbyid(id);
		 
	 }
	 public Car upCar(Car car)
	 {
		 if (car!=null) {
			 this.carDao.updateCar(car);
			 return car;
			
		} else {
			return null;

		}
	 }
	 public boolean deleteCar(int id)
	 {
		  Car car2=this.findCar(id);
		 if (car2!=null) {
			 this.carDao.deleteCar(car2);
			 return true;
			
		} else {
			 return false;

		}
	 }

}
