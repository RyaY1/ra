package com.ra.system.fegin;

import com.ra.core.constant.ServiceNameConstants;
import com.ra.system.domain.SysUser;
import com.ra.system.fegin.factory.RemoteUserFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = ServiceNameConstants.SYSTEM_SERVICE, fallbackFactory = RemoteUserFallbackFactory.class)
public interface RemoteUserService {

    @GetMapping("user/find/{username}")
    SysUser findByUsername(@PathVariable("username") String username);
}
