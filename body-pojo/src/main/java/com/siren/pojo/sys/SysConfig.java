package com.siren.pojo.sys;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author aqr
 * @email kax@qq.com
 * @date 2022-01-24 15:25:46
 */
@TableName("sys_config")
@Data
public class SysConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @TableId
    private Long id;
    /**
     *
     */
    private String field;
    /**
     *
     */
    private String values;
    /**
     *
     */
    private Date createDate;
}
