package com.cdac.Furniture.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.Furniture.entity.Category;
import com.cdac.Furniture.entity.Furniture;

public interface FurnitureRepo extends JpaRepository<Furniture, Long> {
	public List<Furniture> findByCategory(Category category);
	public List<Furniture> findByPriceBetween(double min, double max);
}
