package com.umiitkose.creational.singleton.detail.enumsignleton;

import java.io.Serializable;

public enum EnumSingleton implements Serializable {
    SINGLETON;

    private static final long serialVersionUID = 5731656641810688225L;

    private EnumSingleton() {
        System.out.println("in EnumSingleton()");
    }

    public static EnumSingleton getInstance() {
        return SINGLETON;
    }


}
