package com.test.hplus.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.hplus.beans.Product;
import com.test.hplus.repository.ProductRepository;



@Controller
public class SearchController {

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/search")
	public String search(@RequestParam("search") String search, Model model) {
	    System.out.println("in search controller");
	    System.out.println("search criteria: " + search);
	    
	    // Modified to add % at both ends for contains search
	    String searchPattern = "%" + search + "%"; 
	    
	    List<Product> products = productRepository.searchByName(searchPattern);
	    model.addAttribute("products", products);
	    System.out.println("Number of products found: " + products.size());
	    
	    // Add this for debugging:
	    products.forEach(p -> System.out.println("Found product: " + p.getName()));
	    
	    return "search";
	}
}

