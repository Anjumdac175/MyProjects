package com.cdac.Furniture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.Furniture.entity.Category;
import com.cdac.Furniture.entity.Furniture;
import com.cdac.Furniture.exception.FurnitureNotFoundException;
import com.cdac.Furniture.repository.FurnitureRepo;

@Service
public class FurnitureServiceImpl implements FurnitureService {

	@Autowired
	FurnitureRepo furnitureRepo;
	
	@Override
	public Furniture addNewFurniture(Furniture furniture) {
		return furnitureRepo.save(furniture);
	}

	@Override
	public List<Furniture> fetchAllFurniture() {
		return furnitureRepo.findAll();
	}

	@Override
	public Furniture updateFurnitureByColor(Long furnitureId, String color) {
		Furniture updated = getById(furnitureId);
		updated.setColor(color);
		return furnitureRepo.save(updated);
	}
	

	@Override
	public List<Furniture> findByCategory(Category category){
		List<Furniture> categoryList = furnitureRepo.findByCategory(category);
		if(categoryList.isEmpty()) {
			throw new FurnitureNotFoundException("No items in Category to update");
		}
			return categoryList;
	}
	
	
	@Override
	public List<Furniture> findByRange(double min, double max){
		List<Furniture> priceList = furnitureRepo.findByPriceBetween(min, max);
		
		if(priceList.isEmpty()) {
			throw new FurnitureNotFoundException("No item in that Price Range: "+min+"-"+max);
		}
		return priceList;
	}
	
	@Override
	public boolean deleteFurnitureById(Long furnitureId) {
		Furniture delete = getById(furnitureId);
		furnitureRepo.delete(delete);
		return true;
	}
	
	public Furniture getById(Long furnitureId) {
		return furnitureRepo.findById(furnitureId).orElseThrow(() -> new FurnitureNotFoundException("Furniture not Found with given id "+ furnitureId));
	}
}
