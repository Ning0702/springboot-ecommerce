package com.ningProject.ecommerce.dto;

import java.util.Set;

import com.ningProject.ecommerce.entity.Address;
import com.ningProject.ecommerce.entity.Customer;
import com.ningProject.ecommerce.entity.Order;
import com.ningProject.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {

	private Customer customer;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	private Set<OrderItem> orderItems;
}
