package org.fanke.hermes.kafka.publish;

import org.fanke.hermes.core.constant.LoggerName;
import org.fanke.hermes.core.store.PublishHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KafkaPublishHandler implements PublishHandler{

    private static final Logger log = LoggerFactory.getLogger(LoggerName.KAFKA_STORE_LOGGER_NAME);

    @Override
    public void send() throws Exception {
        log.info("Sending Message By Kafka");
    }
}
