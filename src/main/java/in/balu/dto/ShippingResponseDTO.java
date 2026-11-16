package in.balu.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShippingResponseDTO {

    private Long orderId;

    private String shippingMethod;

    private String status;

    private LocalDateTime shippedAt;

    private LocalDateTime deliveryDate;

    private String carrier;

}
