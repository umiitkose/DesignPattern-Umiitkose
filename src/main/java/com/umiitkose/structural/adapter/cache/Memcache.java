package com.umiitkose.structural.adapter.cache;

public class Memcache implements Cache {
    @Override
    public String getData() {
        return "Memcache'ten data geldi..";
    }
}
