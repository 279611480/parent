package org.yun.ssm.service;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;
import org.yun.ssm.pojo.User;

import java.util.List;

public interface UserTestService {


    User getUserById(@Param("id") String id);

    List<User> getUsetList1();

    Page<User> getUserById2();
}
