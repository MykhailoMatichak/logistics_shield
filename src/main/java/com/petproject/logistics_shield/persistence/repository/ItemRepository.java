package com.petproject.logistics_shield.persistence.repository;

import com.petproject.logistics_shield.persistence.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Item, UUID> {
}
