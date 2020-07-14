package org.yun.ssm.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.yun.ssm.dto.UserDTO;
import org.yun.ssm.pojo.User;
import org.yun.ssm.vo.UserVO;

public interface UserService {

    UserVO selectById(@Param("id") String id);

    UserVO selectById2(@Param("id") String id);

    void deleteById(@Param("id") String id);

    void addOrUpdate(@RequestBody UserDTO dto);
}

