package com.example.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class TaskCool {

    @Scheduled(cron = "0/10 10-11 * * * *")
    public static void testJob(){
        log.info("当前时间是："+ new Date());
    }

}

