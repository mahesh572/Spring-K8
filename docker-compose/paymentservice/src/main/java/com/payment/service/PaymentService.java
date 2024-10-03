package com.payment.service;

import com.payment.payload.PaymentRequest;
import com.payment.payload.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(long orderId);
}
