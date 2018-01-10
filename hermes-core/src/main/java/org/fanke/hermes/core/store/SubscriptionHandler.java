package org.fanke.hermes.core.store;

public interface SubscriptionHandler {

    void pull() throws Exception;
}
