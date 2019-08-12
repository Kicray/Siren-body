package com.siren.pojo.sys;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/12
 */
@Data
public class SysTable implements Serializable {
    private static final long serialVersionUID = 7657650091505912430L;

    private String tableName;
}
