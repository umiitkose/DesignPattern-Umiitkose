package com.umiitkose.creational.singleton.detail.threadsafelazysignleton;

public class SignletonExample {

    private static SignletonExample signletonExample = null;
    private static int count;
    private String objectName;

    private SignletonExample() {
        objectName = "objectName " + count;
        count++;

    }

    public static SignletonExample createSingleObject() {
        //Null kontrolü synchronized ile gereksiz context switch maliyetine neden olur..
        synchronized (SignletonExample.class) {
            if (signletonExample == null)
                signletonExample = new SignletonExample();
        }
        return signletonExample;
    }

    public void print() {
        System.out.println(objectName);
    }
}
