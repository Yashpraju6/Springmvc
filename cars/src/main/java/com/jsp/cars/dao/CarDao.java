package com.jsp.cars.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.cars.entity.Car;

@Component
public class CarDao {
	
	@Autowired
	private EntityManager entityManager;
	
	public CarDao()
	{
	
	}
	 public Car savecar(Car car )
	 {
		 EntityTransaction Transaction=this.entityManager.getTransaction();
		 Transaction.begin();
		 this.entityManager.persist(car);
		 Transaction.commit();
		 return car;
		 
	 }
	  public Car findCarbyid(int id)
	  {
		  return (Car)this.entityManager.find(Car.class,id);
	  }
	  public Car updateCar(Car car)
	  {
		  EntityTransaction Transaction=this.entityManager.getTransaction();
			 Transaction.begin();
			 this.entityManager.merge(car);
			 Transaction.commit();
			 return car;
	  }
	   public boolean deleteCar(Car car)
	   {
		   EntityTransaction Transaction=this.entityManager.getTransaction();
			 Transaction.begin();
			 this.entityManager.remove(car);
			 Transaction.commit();
			 return true;
	   }
	

}
