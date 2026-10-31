package com.petproject.logistics_shield.service;

import com.petproject.logistics_shield.persistence.entity.Item;
import com.petproject.logistics_shield.persistence.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item save(Item item) {
        return itemRepository.save(item);
    }
}
