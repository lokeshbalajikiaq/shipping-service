package in.balu.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "shipping_info")
public class ShippingInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    private String shippingMethod;  // STANDARD     NEXT-DAY

    private LocalDateTime shippedAt;

    private LocalDateTime deliveryDate;

    private String status;          // SHIPPED, IN_TRANSIT, DELIVERED

    private String carrier;                 // FedEX, Shadow, DHL, UPS

}
