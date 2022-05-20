package com.example.Demo.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Model.Cart;
import com.example.Demo.Repository.CartRepository;
import com.example.Demo.Repository.FoodRepository;


@Transactional
@Service
public  class CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private FoodRepository foodRepository;
	
	
	public List<Cart> getList()
	{
		return cartRepository.findAll();
	}
	
	public void saveItem(Cart cart)
	{
		
		cartRepository.save(cart);
	}
	
	public  Cart get(Integer id)
	{
		return cartRepository.findById(id).get();
	}

	
	
	
//	public void saveCart()
//	{
//		cartRepository.save(foodRepository);
//		
//	}

}
