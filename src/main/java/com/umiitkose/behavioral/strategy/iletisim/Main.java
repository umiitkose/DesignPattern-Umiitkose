package com.umiitkose.behavioral.strategy.iletisim;

public class Main {

    public static void main(String[] args) {


        CommunicateContext communicateContext=new CommunicateContext(new SMS());
        communicateContext.gonder();


    }
}
