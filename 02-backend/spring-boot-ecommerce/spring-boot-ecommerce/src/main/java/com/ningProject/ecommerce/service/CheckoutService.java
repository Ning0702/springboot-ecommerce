package com.ningProject.ecommerce.service;

import com.ningProject.ecommerce.dto.Purchase;
import com.ningProject.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

	PurchaseResponse placeOrder(Purchase purchase);
}
