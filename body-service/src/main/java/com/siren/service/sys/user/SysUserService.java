package com.siren.service.sys.user;

import com.siren.pojo.user.SysUser;
import com.siren.response.BodyResp;

import java.util.List;

/**
 * 系统用户业务类
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/27
 */
public interface SysUserService {
    /**
     * 获取用户列表
     * @return
     */
    BodyResp<List<SysUser>> getUserList();
}
