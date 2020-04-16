package com.praneeth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praneeth.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
