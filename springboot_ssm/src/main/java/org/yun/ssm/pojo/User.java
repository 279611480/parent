package org.yun.ssm.pojo;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName User
 * @Author 芸
 * @Date 2020/7/14 13:55
 * @Description TODO
 **/
@Data//包含get/set ，构造器，toString
@Entity
@Builder
@Table(name = "t_user")
public class User {
    @Id
    private String id;
    private String name;
    private String py;
}
