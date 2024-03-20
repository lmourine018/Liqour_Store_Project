package com.liquor_store.order.service;

import com.liquor_store.order.controller.assembler.OrderAssembler;
import com.liquor_store.order.controller.dto.OrderDto;
import com.liquor_store.order.entity.Order;
import com.liquor_store.order.repository.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;
    private final OrderAssembler orderAssembler;

    @Override
    public List<OrderDto> getAllOrders() {
        return orderRepository.findAll()
                .stream()
                .map(orderAssembler::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public OrderDto getOrderById(Integer id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id " + id));
        return orderAssembler.toDto(order);
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = orderAssembler.toEntity(orderDto);
        Order savedOrder = orderRepository.save(order);
        return orderAssembler.toDto(savedOrder);
    }

    @Override
    public OrderDto updateOrder(Integer id, OrderDto orderDto) {
        Order existingOrder = orderRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Order not found with id " + id));

        existingOrder.setStoreId(orderDto.getStoreId());
        existingOrder.setEmployeeId(orderDto.getEmployeeId());
        existingOrder.setDate(orderDto.getDate());
        existingOrder.setTotal(orderDto.getTotal());

        Order updatedOrder = orderRepository.save(existingOrder);
        return orderAssembler.toDto(updatedOrder);
    }

    @Override
    public void deleteOrder(Integer id) {
        Order order = orderRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Order not found with id " + id));

        orderRepository.delete(order);

    }
}
