package com.umiitkose.creational.singleton.example;

public class CacheClient {

    private static volatile CacheClient cacheClient;
    private static int count = 0;

    private CacheClient() {
        count++;
    }

    public static CacheClient getInstance() {
        if (cacheClient == null)
            synchronized (CacheClient.class) {
                if (cacheClient == null) {
                    cacheClient = new CacheClient();
                }
            }
        return cacheClient;
    }

    public static void print() {
        System.out.println(cacheClient + " -> " + count);
    }

}
