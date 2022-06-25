package com.siren.controller.sys;

import com.siren.controller.BaseController;
import com.siren.pojo.request.gateway.LoginForm;
import com.siren.pojo.response.gateway.LoginResult;
import com.siren.response.BodyResp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway/")
public class SysGatewayController extends BaseController {

    @RequestMapping("/login")
    public BodyResp<LoginResult> login(@RequestBody LoginForm form){
        return BodyResp.ok(null);
    }
}
