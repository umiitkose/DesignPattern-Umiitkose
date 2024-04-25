package com.umiitkose.structural.proxy.cachingProxy;

public class Main {

    //https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
