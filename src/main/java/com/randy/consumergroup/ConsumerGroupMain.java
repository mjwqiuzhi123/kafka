package com.randy.consumergroup;

import com.randy.ProducerThread;

/**
 * Author  : RandySun (sunfeng152157@sina.com)
 * Date    : 2017-08-20  14:18
 * Comment :
 */
public class ConsumerGroupMain {

    public static void main(String[] args){
        String brokers = "39.105.8.31:9091";
        String groupId = "group01";
        String topic = "HelloWorld";
        int consumerNumber = 1;

        Thread producerThread = new Thread(new ProducerThread(brokers,topic));
        producerThread.start();

        ConsumerGroup consumerGroup = new ConsumerGroup(brokers,groupId,topic,consumerNumber);
        consumerGroup.start();
    }
}
