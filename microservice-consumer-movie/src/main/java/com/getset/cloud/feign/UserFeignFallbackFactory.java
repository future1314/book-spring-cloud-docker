package com.getset.cloud.feign;

import com.getset.cloud.entity.User;
import feign.hystrix.FallbackFactory;

public class UserFeignFallbackFactory implements FallbackFactory<UserFeignClient> {
    @Override
    public UserFeignClient create(Throwable throwable) {
        return id -> {
            User user = new User();
            user.setId(-1L);
            user.setName("默认用户Feign");
            return user;
        };
    }
}
