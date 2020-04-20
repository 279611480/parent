package org.yun.springbootquartz.config;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yun.springbootquartz.controller.TestQuartzController;

/**
 * @ClassName QuartzConfig
 * @Description 配置
 * @Autor 落笔丶
 * @Date 2020/4/20 23:42
 * @Tel 279611480@qq.com
 */
@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail teatQuartzDetail() {
        return JobBuilder.newJob(TestQuartzController.class).withIdentity("testQuartz").storeDurably().build();
    }

    @Bean
    public Trigger testQuartzTrigger() {
        //设置时间周期单位秒 每隔两秒实行一次
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever();
        return TriggerBuilder.newTrigger().forJob(teatQuartzDetail()).withIdentity("testQuartz").withSchedule(scheduleBuilder).build();
    }
}

