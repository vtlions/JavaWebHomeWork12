package com.vtlions.homework12;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.vtlions.homework12.model.Cart;
import com.vtlions.homework12.model.Customer;
import com.vtlions.homework12.model.Product;

@Configuration
public class Config {

	@Bean
	public Cart getCart() {
		Cart cart = new Cart();
		cart.setMaxSize(5);
		Map<Integer, Product> map = new HashMap<>();
		map.put(1, getProduct().setProductName("Milk").setPrice(35.0));
		map.put(2, getProduct().setProductName("Bread").setPrice(55.0));
		map.put(3, getProduct().setProductName("Water").setPrice(17.0));
		map.put(4, getProduct().setProductName("Apples").setPrice(23.0));
		map.put(5, getProduct().setProductName("Beer").setPrice(70.0));
		cart.setCart(map);
		return cart;
	}

	@Bean
	public Product getProduct() {
		Product product = new Product();
		return product;
	}

	@Bean
	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setCustomerName("Mitia");
		customer.setCart(getCart());
		return customer;
	}
}
