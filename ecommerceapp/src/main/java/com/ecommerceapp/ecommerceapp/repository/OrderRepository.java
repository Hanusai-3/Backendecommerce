package com.ecommerceapp.ecommerceapp.repository;

import com.ecommerceapp.ecommerceapp.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}

