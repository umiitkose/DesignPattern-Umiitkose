package com.umiitkose.creational.singleton.detail.doublechecklockingsignleton;

public class SignletonExample {

    /*Doublechecklockingsignleton 'da java 1.5 öncesi sürümde yapılan bir makalede Thread heap'indeki değerlerin
    ilk null'da misal 6-7 thread içeri girip diğerleri girmediği için ve bu 6-7 thread synchronized'ta da işe tam
    yaramadığı için birden fazla nesne oluşma durumu oluşuyor..
    volatile yapılsa bile 1.5 öncesinde tam çalışmadığı için sorun oluşuyordu.
    */

    private static SignletonExample signletonExample = null;
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
