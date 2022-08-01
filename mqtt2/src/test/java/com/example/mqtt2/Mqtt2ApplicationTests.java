package com.example.mqtt2;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class Mqtt2ApplicationTests {

    @Autowired
    MqttTest mqttTest;

    @Test
    void contextLoads() {
        long time0 = System.currentTimeMillis();
        int i = 1;
        int sleepIndex = 0;
        while (i <= 500000) {


            mqttTest.publishTest();
            if (i % 10000 == 0) {
                sleepIndex++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
        log.info("共发送消息{}条", i - 1);
        log.info("耗时：{}", System.currentTimeMillis() - time0);
        log.info("共sleep：{}", sleepIndex);

    }

}
