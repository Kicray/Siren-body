package com.siren.pojo.user;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/26
 */
@Data
@TableName("sys_user")
public class SysUser {
    @TableId
    private String id;
    private String password;
    private String userName;
    private String userNickname;
    private Date createDate;
    private int status;
    private String phone;
}
