package com.umiitkose.creational.singleton.detail.volatilesignleton;

public class SignletonExample {

    /*Doublechecklockingsignleton 'da sorunu signletonExample objesinde volatile yaparak sorunu çözdük.
    */

    private static volatile SignletonExample signletonExample = null;
    private static int count;
    private String objectName;

    private SignletonExample() {
        objectName = "objectName " + count;
        count++;

    }

    public static SignletonExample createSingleObject() {
        if (signletonExample == null) {
            synchronized (SignletonExample.class) {
                if (signletonExample == null)
                    signletonExample = new SignletonExample();
            }
        }
        return signletonExample;
    }

    public void print() {
        System.out.println(objectName);
    }
}
