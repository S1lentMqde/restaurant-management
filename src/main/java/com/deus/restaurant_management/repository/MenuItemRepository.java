package com.deus.restaurant_management.repository;

import com.deus.restaurant_management.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}