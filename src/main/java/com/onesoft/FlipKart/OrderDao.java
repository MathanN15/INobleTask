package com.onesoft.FlipKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository r;

	public String orderPost(Order o) {
		r.save(o);
		return "Order SuccessFully";
	}

	public List<Order> getAll() {
		return r.findAll();
	}

	public String update(Order o) {
		r.save(o);
		return "Updated SuccessFully";
	}

	public String delete(int id) {
		r.deleteById(id);
		return "Deleted SuccessFully";
	}
}
