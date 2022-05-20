package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Demo.Model.Cart;


public interface CartRepository extends JpaRepository<Cart, Integer> {
	
}
