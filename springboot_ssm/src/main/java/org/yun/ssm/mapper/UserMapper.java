package org.yun.ssm.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.yun.ssm.pojo.User;

/**
 * @ClassName UserMapper
 * @Author 芸
 * @Date 2020/7/14 14:28
 * @Description TODO
 **/
@Repository
public interface UserMapper {

    @Select("select * from t_user where id = #{id}")
    User selectById(@Param("id") String id);
}
