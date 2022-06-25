package com.siren.controller.sys;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.siren.pojo.sys.SysConfig;
import com.siren.pojo.user.SysUser;
import com.siren.response.BodyResp;
import com.siren.service.sys.config.SysConfigService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author aqr
 * @email kax@qq.com
 * @date 2022-01-24 15:25:46
 */
@RestController
@RequestMapping("configs/sysconfig")
public class SysConfigController {
    @Autowired
    private SysConfigService sysConfigService;

    @GetMapping("list")
    @ApiOperation("全部查询接口")
    public BodyResp<List<SysConfig>> getTablesAll() {
        return new BodyResp<List<SysConfig>>(sysConfigService.selectList(new EntityWrapper<>()));
    }
}
