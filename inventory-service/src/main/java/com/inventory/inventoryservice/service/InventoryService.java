package com.inventory.inventoryservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.inventory.inventoryservice.dao.InventoryRepo;
import com.inventory.inventoryservice.entities.Inventory;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepo repo;

	public ResponseEntity<Inventory> addInventory(Inventory inventory) {
		try {
			Inventory inv = repo.save(new Inventory(inventory.getProduct_id(), inventory.getQuantity()));
			return new ResponseEntity<>(inv, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public Inventory findInventoryById(int product_id) {
		return repo.findById(product_id).get();
	}

	public void reduceInventoryQuantity(Inventory request) {
		repo.save(request);
	}
}
