package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Demo.Model.FoodItem;

public interface FoodRepository extends JpaRepository<FoodItem, Integer> {

}
