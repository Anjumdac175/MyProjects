package com.cdac.Furniture.service;

import java.util.List;

import com.cdac.Furniture.entity.Category;
import com.cdac.Furniture.entity.Furniture;

public interface FurnitureService {
	public Furniture addNewFurniture(Furniture furniture);
	public List<Furniture> fetchAllFurniture();
	public Furniture updateFurnitureByColor(Long furnitureId,String color);
	public List<Furniture> findByCategory(Category category);
	public List<Furniture> findByRange(double min, double max);
	public boolean deleteFurnitureById(Long furnitureId);
}
