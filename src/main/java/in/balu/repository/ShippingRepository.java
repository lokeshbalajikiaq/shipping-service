package in.balu.repository;

import in.balu.models.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<ShippingInfo, Long> {

    ShippingInfo findByOrderId(Long orderId);

}
