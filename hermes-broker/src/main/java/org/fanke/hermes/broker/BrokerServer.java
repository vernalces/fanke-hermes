package org.fanke.hermes.broker;

import org.fanke.hermes.broker.bootstrap.BrokerBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author vernalces@163.com
 */
@SpringBootApplication
public class BrokerServer {

    public static void main(String[] args) {
        SpringApplication.run(BrokerServer.class,args);
    }

//    private static BrokerBootstrap createBrokerBootstrap(String[] args){
//        private static  BrokerBootstrap brokerBootstrap = new BrokerBootstrap();
//        return brokerBootstrap;
//    }
}
