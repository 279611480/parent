package org.yun.ssm.dto;

import lombok.Data;

/**
 * @ClassName PageEntityDTO
 * @Description
 * @Autor 落笔丶
 * @Date 2020/11/2 23:11
 * @Tel 279611480@qq.com
 */
@Data
public class PageEntityDTO extends UserDTO{

    private int page;
    private int rows;


}
