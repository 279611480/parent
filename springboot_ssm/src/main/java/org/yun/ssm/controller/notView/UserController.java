package org.yun.ssm.controller.notView;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.yun.ssm.dto.UserDTO;
import org.yun.ssm.service.UserService;
import org.yun.ssm.vo.UserVO;

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

    /* 网页输入
     * http://localhost:8080/user/selectById/1
     * 网页500，正常，没有返回值出去，直接看控制台输出，看User信息输出
     * */
    @RequestMapping(value = "/selectById/{id}", method = RequestMethod.GET)
    public void selectById(@PathVariable String id) {
        UserVO userVO = userService.selectById(id);
        System.out.println(userVO.toString());
    }

    /* 网页输入
     * http://localhost:8080/user/selectById2/1
     * @ResponseBody，如果类名上面注解@Controller改为@RestController,那么去除此注解。
     * @RestController为@Controller+@ResponseBode
     * */
    @RequestMapping(value = "/selectById2/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UserVO selectById2(@PathVariable String id) {
        UserVO userVO = userService.selectById2(id);
        return userVO;
    }

    /*
     *  http://localhost:8080/user/deleteById/3
     *  浏览器输入，出现404正常。
     */
    @RequestMapping("/deleteById/{id}")
    public void deleteById(@PathVariable String id) {
        System.out.println("删除开始--->");
        userService.deleteById(id);
        System.out.println("删除结束--->");
    }

    /*
     * 添加OR修改
     * 404正常，没有使用@ResponseBody返回出去,看数据库记录
     * postman测试
     * http://localhost:8080/user/addOrUpdate
     * */
    @RequestMapping("/addOrUpdate")
    public void addOrUpdate(@RequestBody UserDTO dto) {
        System.out.println(dto.toString());
        System.out.println("添加OR修改开始--->");
        userService.addOrUpdate(dto);
        System.out.println("添加OR修改结束--->");
    }


}
