package com.umiitkose.creational.singleton.detail.billpughsignleton;

public class SignletonExample {

    private static int count;
    private String objectName;

    private SignletonExample() {
        objectName = "objectName " + count;
        count++;

    }

    public void print() {
        System.out.println(objectName);
    }

    private static class SingletonHelper {
        private static final SignletonExample INSTANCE = new SignletonExample();
    }

    public static SignletonExample createSingleObject() {
        return SingletonHelper.INSTANCE;
    }


}
