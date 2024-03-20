package com.liquor_store.order.controller;

import com.liquor_store.order.controller.dto.OrderDetailsDto;
import com.liquor_store.order.service.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/order-details")
public class OrderDetailsController {
    private OrderDetailsService orderDetailsService;

    @GetMapping
    public List<OrderDetailsDto> getAllOrderDetails() {
        return orderDetailsService.getAllOrderDetails();
    }

    @GetMapping("/{id}")
    public OrderDetailsDto getOrderDetailById(@PathVariable Integer id) {
        return orderDetailsService.getOrderDetailById(id);
    }

    @PostMapping
    public OrderDetailsDto createOrderDetail(@RequestBody OrderDetailsDto orderDetailDTO) {
        return orderDetailsService.createOrderDetail(orderDetailDTO);
    }

    @PutMapping("/{id}")
    public OrderDetailsDto updateOrderDetail(@PathVariable Integer id, @RequestBody OrderDetailsDto orderDetailDTO) {
        return orderDetailsService.updateOrderDetail(id, orderDetailDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderDetail(@PathVariable Integer id) {
        orderDetailsService.deleteOrderDetail(id);
    }
}
