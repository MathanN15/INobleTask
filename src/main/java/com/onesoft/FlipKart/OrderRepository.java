package com.onesoft.FlipKart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Integer> {
//	@Query(value = "select flipkart_order.city,flipkart_product.name from flipkart_order inner join flipkart_product on flipkart_order.order_id=flipkart_product.order_fk", nativeQuery = true)
//	public List<Object> getAll();
}
