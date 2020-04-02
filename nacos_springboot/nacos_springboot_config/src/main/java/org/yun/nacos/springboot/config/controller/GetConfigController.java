package org.yun.nacos.springboot.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GetConfigController
 * @Author 芸
 * @Date 2020/4/2 16:55
 * @Description NacosConfig
 **/
@RestController
@RequestMapping("/nacos")
@RefreshScope//动态发现
public class GetConfigController {

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/getName")
    private String getName(){
        return "网站上的配置,覆盖掉此处的配置" + name;
//        return "测试";

    }

}
