package org.yun.springbootquartz.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.cron.CronUtil;
import cn.hutool.cron.task.Task;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

import java.util.Date;

/**
 * @ClassName TestHutoolCrom
 * @Description 测试Hutool的定时任务
 * @Autor 落笔丶
 * @Date 2020/4/21 0:22
 * @Tel 279611480@qq.com
 */
public class TestHutoolCron {

    private static final Log log = LogFactory.get();

    /*
    * crontab文件的含义：
        用户所建立的crontab文件中，每一行都代表一项任务，每行的每个字段代表一项设置，它的格式共分为六个字段，前五段是时间设定段，第六段是要执行的命令段，格式如下：
        minute   hour   day   month   week   command
        其中：
        minute： 表示分钟，可以是从0到59之间的任何整数。
        hour：表示小时，可以是从0到23之间的任何整数。
        day：表示日期，可以是从1到31之间的任何整数。
        month：表示月份，可以是从1到12之间的任何整数。
        week：表示星期几，可以是从0到7之间的任何整数，这里的0或7代表星期日。
        command：要执行的命令，可以是系统命令，也可以是自己编写的脚本文件。
    * */

    /*配置信息在cron.setting里面*/
    public void TestHutoolCron111() {
        log.info("定时任务，11111111111~~~~~~~~~~~~~~" + DateUtil.formatDateTime(new Date()));
    }

    /*配置信息在cron.setting里面*/
    public void TestHutoolCron222() {
        log.info("定时任务，~~~~~~222222" + DateUtil.formatDateTime(new Date()));

//TODO 有问题       //会覆盖  使用sleep？wait通知等待？互不干扰
//        new Thread(new TestHutoolCron333()).start();
    }


//    /*动态加入定时任务，配置不会写在cron.setting的配置文件里面*/
//    class TestHutoolCron333 implements Runnable {
//        @Override
//        public void run() {
//
//            CronUtil.schedule("*/1 * * * * *", new Task() {
//                @Override
//                public void execute() {
//                    log.info("测试动态加入定时任务：3333333333" + DateUtil.formatDateTime(new Date()));
//                }
//            });
////            CronUtil.setMatchSecond(true);//支持秒级
////            CronUtil.start();//true为守护进程
//        }
//    }

}
