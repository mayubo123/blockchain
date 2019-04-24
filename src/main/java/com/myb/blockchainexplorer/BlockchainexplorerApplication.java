package com.myb.blockchainexplorer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.myb.blockchainexplorer.dao")
@EnableFeignClients
@EnableAsync
public class BlockchainexplorerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockchainexplorerApplication.class, args);
    }

}
