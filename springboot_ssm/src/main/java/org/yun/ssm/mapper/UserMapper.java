package org.yun.ssm.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.yun.ssm.vo.UserVO;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Author 芸
 * @Date 2020/7/14 14:28
 * @Description TODO
 **/
@Repository
public interface UserMapper  {

    @Select("select * from t_user where id = #{id}")
    UserVO selectById(@Param("id") String id);

    @Select("select * from t_user where id = #{id}")
    UserVO selectById2(@Param("id") String id);

    @Delete("delete from t_user where id = #{id} ")
    void deleteById(@Param("id") String id);

    @Select("select * from t_user")
    List<UserVO> selectAll();

    /*
     * #加双引号''，防SQL注入，效率较高
     * $设值进去
     */
    @Insert("insert into t_user value(#{uuid},#{name},#{age})")
    void add(@Param("uuid") String uuid, @Param("name") String name, @Param("age") Integer age);

    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void update(@Param("id") String id, @Param("name") String name, @Param("age") Integer age);
}
