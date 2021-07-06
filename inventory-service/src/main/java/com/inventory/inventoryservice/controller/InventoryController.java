package com.inventory.inventoryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.inventoryservice.entities.Inventory;
import com.inventory.inventoryservice.service.InventoryService;

@RestController
public class InventoryController {
	
	@Autowired
	InventoryService service;
	
	@PostMapping("/inventory")
    public ResponseEntity<Inventory> addInventory(@RequestBody Inventory inventory){
		return service.addInventory(inventory);
    }
	
	 @GetMapping("/inventory/{product_id}")
	    public Inventory findInventoryById(@PathVariable("product_id") int product_id) {
		 return service.findInventoryById(product_id); 
	 }
	 
	 @PutMapping("/inventory/updateQty")
	    public void reduceInventoryQuantity(@RequestBody Inventory request) {
		  service.reduceInventoryQuantity(request);
	 }
	
}