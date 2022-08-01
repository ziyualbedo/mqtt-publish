//package com.example.mqtt2;
//
//import lombok.extern.slf4j.Slf4j;
//import org.eclipse.paho.client.mqttv3.*;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Component
//public class MqttProviderCallBack implements MqttCallback{
//
//
////    public MqttProviderCallBack(String clientId) {
////        this.clientId = clientId;
//////        this.clientId2 = clientId2;
////    }
//
//    @Value("${spring.mqtt.client.id}")
//    private String clientId;
//
////    private String clientId2 = "publish2";
//    /**
//     * 与服务器断开的回调
//     */
//    @Override
//    public void connectionLost(Throwable cause) {
//        log.info("{} 与服务器断开连接", clientId );
//    }
//
//    /**
//     * 消息到达的回调
//     */
//    @Override
//    public void messageArrived(String topic, MqttMessage message) throws Exception {
//
//    }
//
//    /**
//     * 消息发布成功的回调
//     */
//    @Override
//    public void deliveryComplete(IMqttDeliveryToken token) {
//        IMqttAsyncClient client = token.getClient();
//        System.out.println(client.getClientId()+"发布消息成功！");
////        System.out.println(clientId+"发布消息成功！");
//    }
//
//}
//
