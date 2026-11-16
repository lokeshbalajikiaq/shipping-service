package in.balu.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShippingRequestDTO {

    private Long orderId;

    private String shippingMethod;      // STANDARD     EXPRESS

    private String carrier;             // FedEx        Shadow

}
