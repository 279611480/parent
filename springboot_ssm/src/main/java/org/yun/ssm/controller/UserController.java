package org.yun.ssm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yun.ssm.pojo.User;
import org.yun.ssm.service.UserService;

/**
 * @ClassName UserController
 * @Author 芸
 * @Date 2020/7/14 14:17
 * @Description TODO
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired(required = true)
    UserService userService;

    /*
     * http://localhost:8080/user/selectById2/1
     * 网页500，正常，没有返回值出去，直接看控制台输出，看User信息输出
     * */
    @RequestMapping(value = "/selectById/{id}", method = RequestMethod.GET)
    public void selectById(@PathVariable String id) {
        User user = userService.selectById(id);
        System.out.println(user.toString());
    }


}
