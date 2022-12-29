//package com.binar.chapter8.scheduler;
//
//import com.binar.chapter8.model.Films;
//import com.binar.chapter8.service.FilmsServiceImpl;
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.quartz.QuartzJobBean;
//
//import java.util.List;
//
//public class NotificationScheduler extends QuartzJobBean {
//
//
//    private static final Logger logger = LoggerFactory.getLogger(FilmScheduler.class);
//
//    @Override
//    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
//        try {
//            logger.info("\nscheduler is running : ");
//            if () {}
//        } catch (Exception e) {
//            logger.error("error to show film, caused by : ", e.getMessage());
//        }
//
//    }
//}
