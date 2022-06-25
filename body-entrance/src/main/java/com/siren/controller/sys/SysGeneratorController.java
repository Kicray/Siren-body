package com.siren.controller.sys;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.siren.controller.BaseController;
import com.siren.service.sys.generator.SysGeneratorService;
import io.swagger.annotations.Api;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/24
 */
@RestController
@Api(tags = "代码生成器(不可用)")
@RequestMapping("sys/generator")
public class SysGeneratorController extends BaseController {

    @Autowired
    private SysGeneratorService sysGeneratorService;

    /**
     * 生成代码
     */
    @RequestMapping("/code")
    @DS("slaver")
    public void code(@RequestParam String tables, HttpServletResponse response) throws IOException {
        byte[] data = sysGeneratorService.generatorCode(tables.split(","));

        response.reset();
        response.setHeader("Content-Disposition", "attachment; filename=\"renren.zip\"");
        response.addHeader("Content-Length", "" + data.length);
        response.setContentType("application/octet-stream; charset=UTF-8");

        IOUtils.write(data, response.getOutputStream());
    }

}
