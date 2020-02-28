package com.ra.auth.service;

import com.ra.system.domain.SysUser;
import com.ra.system.fegin.RemoteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yl
 * @Date 2020/2/28 0028 14:36
 */
@Service
public class FeignTestService {

    @Autowired
    private RemoteUserService userService;

    public SysUser findByUsername(String username){
        return userService.findByUsername(username);
    }
}
