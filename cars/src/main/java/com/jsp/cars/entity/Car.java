package com.jsp.cars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Scope("prototype")
public class Car {
	@Id
	@Column(nullable = false,unique = true)
	 private int id;
	 private String carname;
	 private double price;
	 private String usermailid;
	 @Column(length = 10,nullable = false)
	 private long phno;
	 
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(int id, String carname, double price, String usermailid, long phno) {
		super();
		this.id = id;
		this.carname = carname;
		this.price = price;
		this.usermailid = usermailid;
		this.phno = phno;
	}

	public int getid() {
		return id;
	}
	public void setid(int carid) {
		this.id = id;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUsermailid() {
		return usermailid;
	}
	public void setUsermailid(String usermailid) {
		this.usermailid = usermailid;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", carname=" + carname + ", price=" + price + ", usermailid=" + usermailid
				+ ", phno=" + phno + "]";
	}
	

}
