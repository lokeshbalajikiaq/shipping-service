package in.balu.controller;

import com.netflix.discovery.converters.Auto;
import in.balu.dto.ShippingRequestDTO;
import in.balu.dto.ShippingResponseDTO;
import in.balu.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @Autowired
    private ShippingService shippingService;

    public ShippingResponseDTO shipOrder(@RequestBody ShippingRequestDTO request) {

        return shippingService.shipOrder(request);

    }

}
