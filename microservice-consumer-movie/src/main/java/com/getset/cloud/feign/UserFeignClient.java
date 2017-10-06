package com.getset.cloud.feign;

import com.getset.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider-user", fallbackFactory = UserFeignFallbackFactory.class)
public interface UserFeignClient {
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    User FindUserById(@PathVariable("id") Long id);
}
