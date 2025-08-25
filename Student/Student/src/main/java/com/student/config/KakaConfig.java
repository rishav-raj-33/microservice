package com.student.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KakaConfig {


    @Bean
    NewTopic topic(){
        return TopicBuilder.name("studentChannel").build();
    }


    @Bean
    NewTopic topic2(){
        return TopicBuilder.name("channel2").build();
    }


}
