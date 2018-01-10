package org.fanke.hermers.common;

public class MQVersion {
    public static final int CURRENT_VERSION = Version.V1_0_0_SNAPSHOT.ordinal();

    public static String getVersionDesc(int value){
        int length = Version.values().length;

        if(value >= length){
            return Version.values()[length -1].name();
        }

        if(value < 1){
            return Version.values()[0].name();
        }

        return Version.values()[value].name();
    }

    public enum Version{
        UNKNOWN_VERSION,

        V1_0_0_SNAPSHOT,
        V1_0_0,

        HIGHER_VERSION
    }
}
