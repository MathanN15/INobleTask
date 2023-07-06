package com.onesoft.FlipKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderService s;

	@PostMapping("postOrder")
	public String orderPost(@RequestBody Order o) {
		return s.orderPost(o);
	}

	@GetMapping("getAllFlipkart")
	public List<Order> getAll() {
		return s.getAll();
	}

	@PutMapping("update/{id}")
	public String update(@RequestBody Order o) {
		return s.update(o);
	}

	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		return s.delete(id);
	}

}
/*
 * { "city":"Goa", "pincode":"600895", "products":[ { "p_id":"12",
 * "name":"shoe", "price":"20000" }, { "p_id":"13", "name":"bear",
 * "price":"15000" }, { "p_id":"35", "name":"snacks", "price":"1000" }
 * 
 * ] }
 */

/*
 * for UPDATE { "id":"6", "city":"Colimbatore", "pincode":"600545", "products":[
 * { "p_id":"09", "name":"Heater", "price":"200990" }] }
 * 
 */
