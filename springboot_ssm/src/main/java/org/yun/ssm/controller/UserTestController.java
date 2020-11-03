package org.yun.ssm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yun.ssm.dto.PageEntityDTO;
import org.yun.ssm.pojo.User;
import org.yun.ssm.service.UserTestService;

import java.util.List;

/**
 * @ClassName UserTestController
 * @Description 来源：https://www.cnblogs.com/jiefu/p/12490219.html
 * @Autor 落笔丶
 * @Date 2020/11/2 22:21
 * @Tel 279611480@qq.com
 */
@RestController
@RequestMapping("/tuser")
public class UserTestController {

    @Autowired
    private UserTestService userTestService;

    /**
    *
     * @Author 落笔丶
     * @Description get  http://localhost:8080/tuser/getUserById/1
     * @Date  2020/11/3 21:54
     * @Param  * @param null
     * @return
     **/
    @RequestMapping("/getUserById/{id}")
    public User getUserById(@PathVariable String id) {

        return userTestService.getUserById(id);
    }


    /**
     * @return
     * @Author 落笔丶
     * @Description 分页查询一
     * post  使用postman测试，有页数信息返回
     *  http://127.0.0.1:8080/tuser/getUserList1
     * @Date 2020/11/2 22:33
     * @Param
     **/
    @RequestMapping("/getUserList1")
    public Object getUserList1(@RequestBody PageEntityDTO dto) {
        PageHelper.startPage(dto.getPage(), dto.getRows());
        List<User> list = userTestService.getUsetList1();
        PageInfo<User> userPageInfo = new PageInfo<>(list);
        return userPageInfo;
    }


    /**
     * @return
     * @Author 落笔丶
     * @Description 分页查询二
     * http://127.0.0.1:8080/tuser/getUserList2   使用postman测试，没有页数信息返回
     * @Date 2020/11/2 22:47
     * @Param
     **/
    @RequestMapping("getUserList2")
    public Object getUserById2(@RequestBody PageEntityDTO dto) {
        PageHelper.startPage(dto.getPage(), dto.getRows());
        Page<User> list = userTestService.getUserById2();
        return list;
    }

}
