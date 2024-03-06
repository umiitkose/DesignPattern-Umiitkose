package com.umiitkose.structural.adapter.cache;

public class CacheAdapter implements Cache{
    CacheForRedis cacheForRedis;

    public CacheAdapter(CacheForRedis cacheForRedis) {
        this.cacheForRedis = cacheForRedis;
    }


    @Override
    public String getData() {
        cacheForRedis.getSetData();
        return "Redis'teki datayı memcache'te de kullanabiliyorum.";
    }
}
