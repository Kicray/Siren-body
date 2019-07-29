package com.siren.controller.sys;

import com.siren.controller.BaseController;
import com.siren.pojo.user.SysUser;
import com.siren.response.BodyResp;
import com.siren.service.sys.user.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/24
 */
@RestController
@RequestMapping("sys")
@Api("系统接口")
public class SysController extends BaseController {

    @Autowired
    private SysUserService userService;

    @GetMapping("user/all")
    @ApiOperation("全部用户查询接口")
    public BodyResp<List<SysUser>> getUserAll(){
        return userService.getUserList();
    }

    @GetMapping("user/{id}")
    @ApiOperation("某个用户查询接口")
    @ApiImplicitParams({@ApiImplicitParam(name = "id",value = "用户id",paramType = "path",dataType = "String")})
    public BodyResp<SysUser> getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    }
}
