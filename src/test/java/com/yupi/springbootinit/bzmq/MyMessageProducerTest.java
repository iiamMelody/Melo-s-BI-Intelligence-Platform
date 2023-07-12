package com.yupi.springbootinit.bzmq;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyMessageProducerTest {

    @Resource
    private MyMessageProducer messageProducer;

    @Test
    void sendMessage(){
        messageProducer.sendMessage("code_exchange","my_routingKey","hello~melody");
    }

}