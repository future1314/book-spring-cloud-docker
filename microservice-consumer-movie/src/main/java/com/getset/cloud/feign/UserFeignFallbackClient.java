package com.getset.cloud.feign;

import com.getset.cloud.entity.User;
import org.springframework.stereotype.Component;

public class UserFeignFallbackClient implements UserFeignClient {
    @Override
    public User FindUserById(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setName("默认用户Feign");
        return user;
    }
}
