package in.balu.service;

import in.balu.dto.ShippingRequestDTO;
import in.balu.dto.ShippingResponseDTO;

public interface ShippingService {

    ShippingResponseDTO shipOrder(ShippingRequestDTO request);

    void updateShippingStatus(Long orderId, String status);

}
