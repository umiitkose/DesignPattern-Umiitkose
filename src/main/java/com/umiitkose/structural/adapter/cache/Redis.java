package com.umiitkose.structural.adapter.cache;

public class Redis implements CacheForRedis{
    @Override
    public String getData() {
            return "Redisten data geldi";
    }

    @Override
    public void getSetData() {
        System.out.println("Data set olarak Döndü");
    }
}
