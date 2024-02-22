package com.umiitkose.creational.builder.oda;

public class RoomJavaBean {

    //gerekli olan parametrelerimiz
    private String roomName = "";
    private int size = -1;
    private int windowCount = -1;

    //opsiyonel parametreler
    private boolean isBed;
    private boolean isStudyDesk;
    private int deskCount;

    public RoomJavaBean() {

    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWindowCount(int windowCount) {
        this.windowCount = windowCount;
    }

    public void setBed(boolean bed) {
        isBed = bed;
    }

    public void setStudyDesk(boolean studyDesk) {
        isStudyDesk = studyDesk;
    }

    public void setDeskCount(int deskCount) {
        this.deskCount = deskCount;
    }
}
