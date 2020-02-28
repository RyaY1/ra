package com.ra.system.controller;

import cn.hutool.core.convert.Convert;

import com.ra.core.core.controller.BaseController;
import com.ra.core.core.domain.R;
import com.ra.system.domain.SysUser;
import com.ra.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * 用户 提供者
 * 
 * @author zmr
 * @date 2019-05-20
 */
@RestController
@RequestMapping("user")
public class SysUserController extends BaseController {

    @Autowired
    private ISysUserService sysUserService;


    /**
     * 查询用户
     */
    @GetMapping("find/{username}")
    public SysUser findByUsername(@PathVariable("username") String username) {
        return sysUserService.selectUserByLoginName(username);
    }

    /**
     * 查询拥有当前角色的所有用户
     */
    @GetMapping("hasRoles")
    public Set<Long> hasRoles(String roleIds) {
        Long[] arr = Convert.toLongArray(roleIds);
        return sysUserService.selectUserIdsHasRoles(arr);
    }

    /**
     * 查询所有当前部门中的用户
     */
    @GetMapping("inDepts")
    public Set<Long> inDept(String deptIds) {
        Long[] arr = Convert.toLongArray(deptIds);
        return sysUserService.selectUserIdsInDepts(arr);
    }

    /**
     * 查询用户列表
     */
    @GetMapping("list")
    public R list(SysUser sysUser) {
        startPage();
        return result(sysUserService.selectUserList(sysUser));
    }
}
