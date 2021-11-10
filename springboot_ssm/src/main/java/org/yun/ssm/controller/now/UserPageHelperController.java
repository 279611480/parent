package org.yun.ssm.controller.now;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yun.common.util.result.Result;
import org.yun.ssm.service.UserService;
import org.yun.ssm.vo.UserVO;

import java.util.List;

@RequestMapping("/userPageHelper")
@RestController
public class UserPageHelperController {
    @Autowired
    UserService userService;

    /*PageInfo.pageNum	当前页码
    PageInfo.pageSize	当前页面显示的数据条目
    PageInfo.pages	总页数
    PageInfo.total	数据的总条目数
    PageInfo.prePage	上一页
    PageInfo.nextPage	下一页
    PageInfo.isFirstPage	是否为第一页
    PageInfo.isLastPage	是否为最后一页
    PageInfo.hasPreviousPage	是否有上一页
    PageHelper.hasNextPage	是否有下一页*/

    @PostMapping(value = "/getAll")
    public Result getAll(@RequestParam int pageNum,//当前页码
                         @RequestParam int pageSize//当前页面显示的数据条目
    ) {
        Result result = new Result();
        PageHelper.startPage(pageNum, pageSize);
        List<UserVO> list = userService.getAll(result);
        PageInfo<UserVO> pageInfo = new PageInfo<UserVO>(list);
        result.setData(pageInfo);
        return result;
    }


}
