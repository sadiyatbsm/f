package com.example.Demo.Services;



import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Model.FoodItem;
import com.example.Demo.Repository.FoodRepository;



@Transactional
@Service
public class FoodService {

	@Autowired
	private FoodRepository foodrepository;
	
	public List<FoodItem> listAll()
	{
		return foodrepository.findAll();
	}
	
	public void saveFood(FoodItem fooditem)
	{
		foodrepository.save(fooditem);
	}
	
	public  FoodItem get(Integer id)
	{
		return foodrepository.findById(id).get();
	}
	
	public void delete(Integer id)
	{
		foodrepository.deleteById(id);
	}

   
	
	
	
	
	
	
	
	
	
	
	
	
}
