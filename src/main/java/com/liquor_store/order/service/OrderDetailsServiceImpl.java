package com.liquor_store.order.service;

import com.liquor_store.order.controller.assembler.OrderDetailsAssembler;
import com.liquor_store.order.controller.dto.OrderDetailsDto;
import com.liquor_store.order.entity.OrderDetails;
import com.liquor_store.order.repository.OrderDetailsRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService {

    private final OrderDetailsRepository orderDetailsRepository;

    private final OrderDetailsAssembler orderDetailsAssembler;

    @Override
    public List<OrderDetailsDto> getAllOrderDetails() {
        return orderDetailsRepository.findAll()
                .stream()
                .map(orderDetailsAssembler::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public OrderDetailsDto getOrderDetailById(Long id) {
        OrderDetails orderDetail = orderDetailsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order Detail not found with id " + id));
        return orderDetailsAssembler.toDto(orderDetail);
    }

    @Override
    public OrderDetailsDto createOrderDetail(OrderDetailsDto orderDetailDTO) {
        OrderDetails orderDetail = orderDetailsAssembler.toEntity(orderDetailDTO);
        OrderDetails savedOrderDetail = orderDetailsRepository.save(orderDetail);
        return orderDetailsAssembler.toDto(savedOrderDetail);
    }

    @Override
    public OrderDetailsDto updateOrderDetail(Long id, OrderDetailsDto orderDetailsDto) {
        OrderDetails existingOrderDetails = orderDetailsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order Detail not found with id " + id));

//        existingOrderDetails.setOrder(orderDetailsDto.getOrder());
//        existingOrderDetails.setProduct(orderDetailsDto.getProduct());
        existingOrderDetails.setQuantity(orderDetailsDto.getQuantity());
        existingOrderDetails.setUnitPrice(orderDetailsDto.getUnitPrice());

        OrderDetails updatedOrderDetail = orderDetailsRepository.save(existingOrderDetails);
        return orderDetailsAssembler.toDto(updatedOrderDetail);
    }

    @Override
    public void deleteOrderDetail(Long id) {

    }
}
