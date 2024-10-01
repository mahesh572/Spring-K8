package com.order.service;

import com.order.payload.OrderRequest;
import com.order.payload.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
