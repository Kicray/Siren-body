package com.siren.controller.index;

import com.siren.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/24
 */
@RestController
@RequestMapping("index")
public class IndexController extends BaseController {

    @RequestMapping("hello")
    public String index(){
        return "Aloha Siren...";
    }
}
