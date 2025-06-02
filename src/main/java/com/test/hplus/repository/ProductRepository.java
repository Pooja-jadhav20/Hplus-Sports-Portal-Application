package com.test.hplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.hplus.beans.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    // Modified for case-insensitive search
    @Query("SELECT p FROM Product p WHERE LOWER(p.name) LIKE LOWER(:searchPattern)")
    List<Product> searchByName(@Param("searchPattern") String searchPattern);
}