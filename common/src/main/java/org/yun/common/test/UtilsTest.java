package org.yun.common.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName UtilsTest
 * @Description TODO
 * @Autor 落笔丶
 * @Date 2020/11/5 23:03
 * @Tel 279611480@qq.com
 */
@Slf4j
public class UtilsTest {

//    //使用了@Slf4j注解，可不写这个
//    private static final Logger log = LoggerFactory.getLogger(UtilsTest.class);

    /**
     * @return
     * @Author 落笔丶
     * @Description
     * @Date 2020/11/5 22:54
     * @Param * @param null
     **/
    @Test
    public void testLog() {
        //logger.error("第x部分出错 ", e);
        String name = "略略略";
        try {
            int i = 100 / 0;
        } catch (Exception e) {
            log.info("测试是否生效name {}，message {}", name, e.getMessage());
        }
    }
}
