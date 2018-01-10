package org.fanke.hermes.broker.bootstrap;

import org.fanke.hermes.core.constant.LoggerName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrokerBootstrap {

    private static final Logger log = LoggerFactory.getLogger(LoggerName.BROKER_LOGGER_NAME);

    public void start() throws Exception {
        log.info("Starting broker");
    }


    public void stop() throws Exception {
        log.info("Stopping broker");
    }
}
