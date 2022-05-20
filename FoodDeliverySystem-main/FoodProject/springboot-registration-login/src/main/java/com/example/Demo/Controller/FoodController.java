package com.example.Demo.Controller;


import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Demo.Model.FoodItem;
import com.example.Demo.Services.FoodService;






@Controller
public class FoodController {
	
	@Autowired
	private FoodService foodservice;
	
	@RequestMapping("/home")
	public String showIndex(Model model)
	{
		List<FoodItem> listproducts = foodservice.listAll();
		model.addAttribute("listproducts", listproducts);
		return "home";
	}
	
	@RequestMapping("/new")
	public String showNewProduct(Model model)
	{
		FoodItem foodItem = new FoodItem();
		model.addAttribute("foodItem",foodItem);
		return "new";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("foodItem")FoodItem foodItem) {
		
		foodservice.saveFood(foodItem);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id")int id)
	{
		ModelAndView obj = new ModelAndView("Edit");
		FoodItem foodItem2 = foodservice.get(id);
		obj.addObject("foodItem2",foodItem2);
		return obj;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name="id")int id)
	{
		foodservice.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/customer view")
	public String showCustomer(Model model)
	{
		List<FoodItem> listproducts = foodservice.listAll();
		model.addAttribute("listproducts", listproducts);
		return "customer";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}


