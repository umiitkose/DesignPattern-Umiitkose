package com.umiitkose.structural.adapter.cache;

public class Main {
    public static void main(String[] args) {
        Cache memcache=new Memcache();
        System.out.println(memcache.getData());

        CacheForRedis redis=new Redis();
        System.out.println(redis.getData());

        Cache cacheForRedis=new CacheAdapter(redis);
        System.out.println(cacheForRedis.getData());
    }
}
