package com.praneeth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praneeth.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}

