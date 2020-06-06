package vip.wuweijie.hello.quarkus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vip.wuweijie.hello.quarkus.entity.Order;

/**
 * @author wuweijie
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
