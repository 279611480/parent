package org.yun.springbootquartz;

import cn.hutool.cron.CronUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName SpringBootQuartzApplication
 * @Description TODO
 * @Autor 落笔丶
 * @Date 2020/4/20 23:49
 * @Tel 279611480@qq.com
 */
@SpringBootApplication
public class SpringBootQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuartzApplication.class, args);

        CronUtil.setMatchSecond(true);//支持秒级
        CronUtil.start(true);//开启所有定时任务
    }


}
