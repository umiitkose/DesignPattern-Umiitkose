package com.umiitkose.creational.builder.oda;

public class RoomTelescoping {

    //gerekli olan parametrelerimiz
    private String roomName;
    private int size;
    private int windowCount;

    //opsiyonel parametreler
    private boolean isBed;
    private boolean isStudyDesk;
    private int deskCount;

    public RoomTelescoping(String roomName, int size, int windowCount) {
        this(roomName, size, windowCount, false, false, 0);
    }

    public RoomTelescoping(String roomName, int size, int windowCount, boolean isBed) {
        this(roomName, size, windowCount, isBed, false, 0);
    }

    public RoomTelescoping(String roomName, int size, int windowCount, boolean isBed, boolean isStudyDesk) {
        this(roomName, size, windowCount, isBed, isStudyDesk, 0);
    }

    public RoomTelescoping(String roomName, int size, int windowCount, boolean isBed, boolean isStudyDesk, int deskCount) {
        this.roomName = roomName;
        this.size = size;
        this.windowCount = windowCount;
        this.isBed = isBed;
        this.isStudyDesk = isStudyDesk;
        this.deskCount = deskCount;
    }
}
