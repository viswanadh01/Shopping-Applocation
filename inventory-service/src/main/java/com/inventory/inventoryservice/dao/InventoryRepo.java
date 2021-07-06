package com.inventory.inventoryservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.inventoryservice.entities.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {

}