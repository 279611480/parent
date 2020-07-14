package org.yun.ssm.service;

import org.apache.ibatis.annotations.Param;
import org.yun.ssm.pojo.User;

public interface UserService {

    User selectById(@Param("id") String id);
}
