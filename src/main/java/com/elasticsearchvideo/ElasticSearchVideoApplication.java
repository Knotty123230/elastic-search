package com.elasticsearchvideo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * The type Elastic search video application.
 */
@SpringBootApplication
@EnableKafka
@EnableDiscoveryClient
public class ElasticSearchVideoApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchVideoApplication.class, args);
    }

}
