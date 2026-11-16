package in.balu.service;

import in.balu.dto.ShippingRequestDTO;
import in.balu.dto.ShippingResponseDTO;
import in.balu.models.ShippingInfo;
import in.balu.repository.ShippingRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ShippingServiceImpl implements  ShippingService {

    @Autowired
    private ShippingRepository shippingRepository;

    @Override
    public ShippingResponseDTO shipOrder(ShippingRequestDTO request) {

        // TODO : Assignment for Order Communication

        ShippingInfo shippingInfo = new ShippingInfo();
        BeanUtils.copyProperties(request, shippingInfo);

        shippingInfo.setStatus("SHIPPED");
        shippingInfo.setShippedAt(LocalDateTime.now());

        ShippingInfo dbShipping = shippingRepository.save(shippingInfo);

        return mapToDto(dbShipping);
    }

    @Override
    public void updateShippingStatus(Long orderId, String status) {

        ShippingInfo shippingInfo = shippingRepository.findByOrderId(orderId);

        if(shippingInfo == null) {
            throw new RuntimeException("Order Not Found");
        }

        shippingInfo.setStatus(status);

        shippingInfo.setDeliveryDate("DELIVERED".equals(status)? LocalDateTime.now() : null);

        shippingRepository.save(shippingInfo);

        if("DELIVERED".equals(status)) {
            // update the order status to SHIPPED to DELIVERED
        }
    }

    private ShippingResponseDTO mapToDto(ShippingInfo dbShipping) {

        ShippingResponseDTO response = new ShippingResponseDTO();
        BeanUtils.copyProperties(dbShipping, response);
        response.setShippedAt(response.getShippedAt());

        return response;

    }

}
