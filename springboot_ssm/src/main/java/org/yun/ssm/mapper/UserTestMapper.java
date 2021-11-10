package org.yun.ssm.mapper;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.yun.ssm.pojo.User;

import java.util.List;

/**
 * @ClassName UserTestMapper
 * @Description TODO
 * @Autor 落笔丶
 * @Date 2020/11/3 21:07
 * @Tel 279611480@qq.com
 */
@Repository
public interface UserTestMapper  {

    @Select("select * from t_user where id = #{id}")
    User getUserById(@Param("id") String id);

    @Select("select * from t_user ")
    List<User> getUserList1();

    @Select("select * from t_user ")
    Page<User> getUserList2();

}
