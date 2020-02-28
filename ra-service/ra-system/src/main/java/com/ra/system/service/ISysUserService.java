package com.ra.system.service;


import com.ra.system.domain.SysUser;

import java.util.List;
import java.util.Set;

/**
 * 用户 业务层
 * 
 * @author ruoyi
 */
public interface ISysUserService {
    /**
     * 根据条件分页查询用户列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
     List<SysUser> selectUserList(SysUser user);

    /**
     * 根据条件分页查询已分配用户角色列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
     List<SysUser> selectAllocatedList(SysUser user);

    /**
     * 根据条件分页查询未分配用户角色列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
     List<SysUser> selectUnallocatedList(SysUser user);

    /**
     * 通过用户名查询用户
     * 
     * @param userName 用户名
     * @return 用户对象信息
     */
     SysUser selectUserByLoginName(String userName);

    /**
     * 通过手机号码查询用户
     * 
     * @param phoneNumber 手机号码
     * @return 用户对象信息
     */
     SysUser selectUserByPhoneNumber(String phoneNumber);

    /**
     * 通过邮箱查询用户
     * 
     * @param email 邮箱
     * @return 用户对象信息
     */
     SysUser selectUserByEmail(String email);

    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 用户对象信息
     */
     SysUser selectUserById(Long userId);


    /**
     * 修改用户详细信息
     * 
     * @param user 用户信息
     * @return 结果
     */
     int updateUserInfo(SysUser user);

    /**
     * 修改用户密码信息
     * 
     * @param user 用户信息
     * @return 结果
     */
     int resetUserPwd(SysUser user);

    /**
     * 校验用户名称是否唯一
     * 
     * @param loginName 登录名称
     * @return 结果
     */
     String checkLoginNameUnique(String loginName);

    /**
     * 校验手机号码是否唯一
     *
     * @param user 用户信息
     * @return 结果
     */
     String checkPhoneUnique(SysUser user);

    /**
     * 校验email是否唯一
     *
     * @param user 用户信息
     * @return 结果
     */
     String checkEmailUnique(SysUser user);

    /**
     * 用户状态修改
     * 
     * @param user 用户信息
     * @return 结果
     */
     int changeStatus(SysUser user);

    /**
     * 查询拥有当前角色的所有用户
     * @param roleIds
     * @return
     * @author zmr
     */
     Set<Long> selectUserIdsHasRoles(Long[] roleIds);

    /**
     * 查询所有当前部门中的用户
     * @param deptIds
     * @return
     * @author zmr
     */
     Set<Long> selectUserIdsInDepts(Long[] deptIds);
}
