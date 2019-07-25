package com.siren.controller.index;

import com.siren.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/24
 */
@RestController
@RequestMapping("index")
@Api("首页模块")
public class IndexController extends BaseController {

    @ApiOperation("Aloha world")
    @GetMapping("hello")
    public String index(){
        return "Aloha Siren...";
    }
}
