package com.umiitkose.creational.singleton.example;

public enum CacheClientEnum {

    SINGLETON;

    public static CacheClientEnum getInstance() {
        return SINGLETON;
    }

}
