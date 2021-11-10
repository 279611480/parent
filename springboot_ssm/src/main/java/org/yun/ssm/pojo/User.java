package org.yun.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName User
 * @Author 芸
 * @Date 2020/7/14 13:55
 * @Description TODO
 **/
@Data//包含get/set，toString
@Entity
@Builder
@Table(name = "parent.t_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String name;
    private String py;
}
