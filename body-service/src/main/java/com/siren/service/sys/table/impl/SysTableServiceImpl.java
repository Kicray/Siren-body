package com.siren.service.sys.table.impl;

import com.siren.mapper.SysTableMapper;
import com.siren.service.sys.table.SysTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/1
 */
@Service
public class SysTableServiceImpl implements SysTableService {
    @Resource
    private  SysTableMapper tableMapper;


    public List<String> getTables(){
        return tableMapper.getTables();
    }

}
