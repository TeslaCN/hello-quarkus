package vip.wuweijie.hello.quarkus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.wuweijie.hello.quarkus.entity.Order;
import vip.wuweijie.hello.quarkus.repository.OrderRepository;

import java.util.List;

/**
 * @author wuweijie
 */
@RestController
@RequestMapping("/order")
public class OrderResource {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }


    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return orderRepository.saveAndFlush(order);
    }

}
