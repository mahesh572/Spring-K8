package com.payment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.entity.TransactionDetails;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Long> {

    Optional<TransactionDetails> findByOrderId(long orderId);
}
