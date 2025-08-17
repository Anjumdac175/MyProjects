package com.cdac.Furniture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.Furniture.entity.Category;
import com.cdac.Furniture.entity.Furniture;
import com.cdac.Furniture.service.FurnitureService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/furniture")
public class FurnitureController {
	
	@Autowired
	FurnitureService furnitureService;
	
	@PostMapping("/add-furniture")
	public ResponseEntity<Furniture> addFurniture(@Valid @RequestBody Furniture furniture) {
		return ResponseEntity.status(201).body(furnitureService.addNewFurniture(furniture));
	}
	
	@GetMapping("/get-furniture")
	public List<Furniture> getFurniture(){
		return furnitureService.fetchAllFurniture();
	}
	
	@PutMapping("/update-furniture/{furnitureId}")
	public ResponseEntity<Furniture> updateByColor(@PathVariable Long furnitureId, @RequestParam String color) {
		return ResponseEntity.ok(furnitureService.updateFurnitureByColor(furnitureId, color));
	}
	
	@GetMapping("/get-furniture/{category}")
	public List<Furniture> getByCategory(@PathVariable Category category){
		return furnitureService.findByCategory(category);
	}
	
	@GetMapping("/get-furntiure/priceRange")
	public List<Furniture> getByPriceRange(@RequestParam double min, @RequestParam double max){
		return furnitureService.findByRange(min, max);
	}
	
	@DeleteMapping("/delete-furniture/{furnitureId}")
	public ResponseEntity<String> deleteById(@PathVariable Long furnitureId) {
		furnitureService.deleteFurnitureById(furnitureId);
		return ResponseEntity.ok("Deleted");
	}
	
}
