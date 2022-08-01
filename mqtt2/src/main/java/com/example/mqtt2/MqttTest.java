package com.example.mqtt2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MqttTest {

    @Autowired
    private MqttConfiguration mqttConfiguration;

    public void publishTest() {
        try {
            mqttConfiguration.publish(0, false, "t/2", "springboot_test");
            log.info("发送成功");
        } catch (Exception e) {
            e.printStackTrace();
            log.info("发送成功");
        }
    }
}
