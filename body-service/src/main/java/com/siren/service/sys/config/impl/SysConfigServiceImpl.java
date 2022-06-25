package com.siren.service.sys.config.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.siren.mapper.configs.SysConfigMapper;
import com.siren.pojo.sys.SysConfig;
import com.siren.service.sys.config.SysConfigService;
import org.springframework.stereotype.Service;


@Service("sysConfigService")
@DS("slaver")
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements SysConfigService {

}
