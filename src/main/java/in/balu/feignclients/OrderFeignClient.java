package in.balu.feignclients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "order-service")
public interface OrderFeignClient {
}
