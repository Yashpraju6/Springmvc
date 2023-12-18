package com.jsp.cars.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.cars.entity.Car;
import com.jsp.cars.service.CarService;


@Controller
public class CarController {
	@Autowired
	private CarService carService;
	
	public CarController()
	{
		
	}
	@RequestMapping({"save"})
	public ModelAndView saveCar(ModelAndView mav,Car car)
	{
		mav.addObject("car",car);
		mav.setViewName("createcar.jsp");
		return mav;
	}
	@RequestMapping(
			value = {"saveCar"},
			method = {RequestMethod.POST}
			)
	public ModelAndView savecartodb(@ModelAttribute Car car,ModelAndView mav)
	{
		this.carService.saveCar(car);	
		mav.setViewName("index.jsp");
		return mav;
	}
	@RequestMapping({"find"})
	public ModelAndView fincar(ModelAndView mav)
	{
		mav.setViewName("findcar.jsp");
		return mav;
		
	}
	@RequestMapping(
			value = {"findcar"},
			method = {RequestMethod.POST}
			)
	public ModelAndView displayfindcar(HttpServletRequest request,ModelAndView mav) {
		  int id= Integer.parseInt(request.getParameter("id"));
		  Car car=this.carService.findCar(id);
		  if (car!=null) {
			  mav.addObject("car",car);
			  mav.setViewName("displaycar.jsp");
			  return mav;
			
		} else {
			mav.addObject("msg","object illa kano");
			mav.setViewName("index.jsp");
			return mav;

		}
		
	}
	@RequestMapping({"update"})
	public ModelAndView updatecardetail(ModelAndView mav)
	{
		mav.setViewName("updatecar.jsp");
		return mav;
	}
	@RequestMapping({"updatecar"})
	public ModelAndView updatecardetails(HttpServletRequest request,ModelAndView mav)
	{
		int id= Integer.parseInt(request.getParameter("id"));
		  Car car=this.carService.findCar(id);
		  if (car!=null) {
			  mav.addObject("car",car);
			  mav.setViewName("displayupdate.jsp");
			  return mav;
			
		} else {
			mav.addObject("msg","ee object madk agallq");
			mav.setViewName("index.jsp");
			return mav;

		}
	}
	@RequestMapping(
			value = {"saveupdate"},
			method = {RequestMethod.POST}
			
			)
	public ModelAndView savecarupdate(@ModelAttribute Car car,ModelAndView mav)
	{
		this.carService.upCar(car);
		mav.addObject("msg" ,"updated sucessfully");
		mav.setViewName("index.jsp");
		return mav;
	}
	 @RequestMapping({"delete"})
	   public ModelAndView deletecar(ModelAndView mav) {
	      mav.setViewName("delete.jsp");
	      return mav;
	   }
	 @RequestMapping({"deleteemployee"})
	   public ModelAndView removeEmployee(HttpServletRequest request, ModelAndView mav) {
	      int id = Integer.parseInt(request.getParameter("id"));
	      Car emp = this.carService.findCar(id);
	      if (emp != null) {
	         this.carService.deleteCar(id);
	         mav.addObject("msg", "Deleted successfully...!");
	         mav.setViewName("index.jsp");
	         return mav;
	      } else {
	         mav.addObject("msg", "Employee does not exits please check the Id");
	         mav.setViewName("index.jsp");
	         return mav;
	      }

}
}
