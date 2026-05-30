package com.deus.restaurant_management.service;

import com.deus.restaurant_management.entity.MenuItem;
import com.deus.restaurant_management.repository.MenuItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;

    public MenuItemService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    public MenuItem create(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public List<MenuItem> getAll() {
        return menuItemRepository.findAll();
    }
}