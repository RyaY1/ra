package com.ra.auth.controller;

import com.ra.auth.service.FeignTestService;
import com.ra.core.core.controller.BaseController;
import com.ra.system.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yl
 * @Date 2020/2/28 0028 14:39
 */
@RestController
public class FeignTestController extends BaseController {

    @Autowired
    private FeignTestService feignTestService;

    /**
     * 查询用户
     */
    @GetMapping("find/{username}")
    public SysUser findByUsername(@PathVariable("username") String username)
    {
          return feignTestService.findByUsername(username);
    }
}
