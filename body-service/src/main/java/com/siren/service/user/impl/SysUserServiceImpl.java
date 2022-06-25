package com.siren.service.user.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.siren.mapper.SySUserMapper;
import com.siren.pojo.user.SysUser;
import com.siren.service.user.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/27
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SySUserMapper userMapper;

    @Override
    public List<SysUser> getUserList() {
        return userMapper.selectList(new EntityWrapper<SysUser>());
    }

    @Override
    public SysUser getUser(String id) {
        return userMapper.getById(id);
    }
}
