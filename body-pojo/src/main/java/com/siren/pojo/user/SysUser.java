package com.siren.pojo.user;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.FieldDefaults;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;
    private int status;
    private String phone;
}
