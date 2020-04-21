//package org.yun.springbootquartz.controller;
//
//import cn.hutool.Hutool;
//import cn.hutool.core.date.DateUtil;
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//import org.springframework.scheduling.quartz.QuartzJobBean;
//
//import java.util.Date;
//
///**
// * @ClassName TestQuartz
// * @Description 测试Quartz的定时任务
// * @Autor 落笔丶
// * @Date 2020/4/20 23:42
// * @Tel 279611480@qq.com
// */
//public class TestQuartzController extends QuartzJobBean {
//
//
//    @Override
//    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        System.out.println("定时任务执行，时间间隔2S：" + new Date() + "Hutool工具类格式化时间：" + DateUtil.formatDateTime(new Date()));
//    }
//
//
//
//
//
//}
