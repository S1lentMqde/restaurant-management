package com.deus.restaurant_management.service;

import com.deus.restaurant_management.entity.MenuItem;
import com.deus.restaurant_management.repository.MenuItemRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuItemServiceTest {

    @Test
    void shouldCreateMenuItem() {

        MenuItemRepository repository =
                Mockito.mock(MenuItemRepository.class);

        MenuItemService service =
                new MenuItemService(repository);

        MenuItem item =
                new MenuItem("Pizza", 12.5);

        Mockito.when(repository.save(item))
                .thenReturn(item);

        MenuItem saved = service.create(item);

        assertEquals("Pizza", saved.getName());
        assertEquals(12.5, saved.getPrice());
    }
}