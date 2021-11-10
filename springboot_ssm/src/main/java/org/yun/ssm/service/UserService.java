package org.yun.ssm.service;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.yun.common.util.result.Result;
import org.yun.ssm.dto.UserDTO;
import org.yun.ssm.vo.UserVO;

import java.util.List;

public interface UserService {

    UserVO selectById(@Param("id") String id);

    UserVO selectById2(@Param("id") String id);

    void deleteById(@Param("id") String id);

    void addOrUpdate(@RequestBody UserDTO dto);

    List<UserVO> getAll(Result result);

}

