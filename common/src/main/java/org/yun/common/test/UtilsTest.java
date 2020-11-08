package org.yun.common.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.yun.common.util.result.Result;
import org.yun.common.util.result.ResultCode;

/**
 * @ClassName UtilsTest
 * @Description TODO 日志模块仍需补充配置
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
            // log.info("测试是否生效name {}，message {}", name, e.getMessage());
            log.info("测试是否生效name {}，message {}", name, e.getMessage() + "，除数不可为0。");


        }
    }

    @Test
    public void testResult(){
        log.info("测试~~");
        String i= "1";
        Result result = new Result(ResultCode.FAIL,i);
        System.out.println(result.getCode() + ",-->" + result.getMessage() + ",-->" + result.getData());
        log.info("结束~~");
    }


}
