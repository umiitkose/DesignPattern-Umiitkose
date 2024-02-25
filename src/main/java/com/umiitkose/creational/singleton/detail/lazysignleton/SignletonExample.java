package com.umiitkose.creational.singleton.detail.lazysignleton;

public class SignletonExample {

    private static SignletonExample signletonExample = null;
    private static int count;
    private String objectName;
    private SignletonExample() {
        objectName = "objectName "+count;
        count++;

    }

    public static SignletonExample createSingleObject() {
        if (signletonExample == null)
            signletonExample = new SignletonExample();
        return signletonExample;
    }

    public void print() {
        System.out.println(objectName);
    }
}
