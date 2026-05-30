package com.deus.restaurant_management.controller;

import com.deus.restaurant_management.dto.MenuItemDto;
import com.deus.restaurant_management.entity.MenuItem;
import com.deus.restaurant_management.service.MenuItemService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {

    private final MenuItemService menuItemService;

    public MenuItemController(MenuItemService menuItemService) {
        this.menuItemService = menuItemService;
    }

    @PostMapping
    public MenuItem create(@Valid @RequestBody MenuItemDto menuItemDto) {
        MenuItem menuItem = new MenuItem();
        menuItem.setName(menuItemDto.getName());
        menuItem.setPrice(menuItemDto.getPrice());
        return menuItemService.create(menuItem);
    }

    @GetMapping
    public List<MenuItem> getAll() {
        return menuItemService.getAll();
    }
}
