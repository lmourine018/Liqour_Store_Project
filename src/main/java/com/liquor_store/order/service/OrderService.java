package com.liquor_store.order.service;

import com.liquor_store.order.controller.dto.OrderDto;
import com.liquor_store.order.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    List<OrderDto> getAllOrders();
    OrderDto getOrderById(Integer id);
    OrderDto createOrder(OrderDto orderDto);
    OrderDto updateOrder(Integer id, OrderDto orderDto);
    void deleteOrder(Integer id);
}
