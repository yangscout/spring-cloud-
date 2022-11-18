package cn.itcast.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="demo-sidecar")
public interface SidecarAPIClient {

    @GetMapping("/getUser")
    Object getUser();

    @GetMapping("/health")
    Object getHealth();


}
