package com.example.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Demo.Model.Cart;
import com.example.Demo.Model.FoodItem;
import com.example.Demo.Services.CartService;
import com.example.Demo.Services.FoodService;


@Controller
public class CartController {
	
	@Autowired
	private CartService cartService;
	@Autowired
	private FoodService foodSer;

	@RequestMapping(value = "/add/{id}",method = RequestMethod.GET)
    public String saveProduct(@ModelAttribute("cart")Cart cart) {
;
		System.out.println("$$$$$$$" + cart.getId());
		FoodItem fi = foodSer.get(cart.getId());
		System.out.println("######## " + fi.getName());
		System.out.println("######## " + fi.getPrice());
		Cart cr2 = new Cart();
		cr2.setName(fi.getName());
		cr2.setPrice(fi.getPrice());
		cartService.saveItem(cr2);
		return "redirect:/customer view";
	}
	
	@RequestMapping("/showcart")
	public String showIndex(Model model)
	{
		List<Cart> cartproducts = cartService.getList();
		long sum=0;
		for(int i=0; i<cartproducts.size();i++) {
			System.out.println("##### " + cartproducts.get(i).getName());
			
			sum=sum+cartproducts.get(i).getPrice();
			
		}
		System.out.println("####"+"Total="+sum);
		model.addAttribute("sum",sum);
		model.addAttribute("cartproducts",cartproducts);
		return "cart";
		
	}
	
//	@RequestMapping("/edit/{id}")
//	public ModelAndView showEditPage(@PathVariable(name = "id")int id)
//	{
//		ModelAndView obj = new ModelAndView("Edit");
//		FoodItem foodItem2 = foodservice.get(id);
//		cartService.sav
//		
//		return obj;
//	}
 }
