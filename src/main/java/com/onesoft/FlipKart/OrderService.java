package com.onesoft.FlipKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderService {
	@Autowired
	OrderDao d;

	public String orderPost(Order o) {
		return d.orderPost(o);
	}

	public List<Order> getAll() {
		return d.getAll();
	}

	public String update(Order o) {
		return d.update(o);
	}

	public String delete(int id) {
		return d.delete(id);
	}
}
