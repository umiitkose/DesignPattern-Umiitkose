package com.umiitkose.creational.builder.oda;
/*
 * Created by umitkose
 * 6.11.2021 - 14:23
 */

public class Main {
    public static void main(String[] args) {

        //RoomTelescoping roomTelescoping=new RoomTelescoping("test",1,1,false,false,1);
       /* RoomJavaBean roomJavaBean=new RoomJavaBean();
        roomJavaBean.setBed(true);
        roomJavaBean.setRoomName("test");
        roomJavaBean.setDeskCount(1);
        roomJavaBean.setSize(12);
        roomJavaBean.setStudyDesk(true);
        roomJavaBean.setWindowCount(3);*/


        RoomBuilder roomBuilder = new RoomBuilder.Builder("Ümitin Odası", 2, 2).build();
        System.out.println(roomBuilder.toString());
    }
}
