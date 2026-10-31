package com.petproject.logistics_shield.controller;

import com.petproject.logistics_shield.persistence.entity.Item;
import com.petproject.logistics_shield.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public String save(@RequestBody Item item) {
        Item savedItem = itemService.save(item);
        return "Saved with ID: " + savedItem.getId();
    }
}
