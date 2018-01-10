package org.fanke.hermes.core.store;

public class StoreType {
    public static final int CURRENT_STORE = Store.KAFKA.ordinal();

    public static String getStoreName(int value){
        int length = Store.values().length;

        if(value >= length || value < 1){
            return Store.values()[0].name;
        }

        return Store.values()[value].name;
    }

    public static String getStoreVersion(int value){
        int length = Store.values().length;

        if(value >= length || value < 1){
            return Store.values()[0].version;
        }

        return Store.values()[value].name;
    }

    public enum Store{

        KAFKA("kafka","1.0.0");

        private Store(String name,String version){
            this.name = name;
            this.version = version;
        }

        private String name;
        private String version;
    }
}
