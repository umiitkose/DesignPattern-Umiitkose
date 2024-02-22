package com.umiitkose.creational.builder.oda;
/*
 * Created by umitkose
 * 6.11.2021 - 14:02
 */

public class Room {

    //gerekli olan parametrelerimiz
    private String roomName;
    private int size;
    private int windowCount;

    //opsiyonel parametreler
    private boolean bed;
    private boolean studyDesk;
    private int deskCount;

    /*
    Bu tarz constructor yapılarının oluşturularak kullanılmasına telescoping constructor anti - pattern deniliyormuş..
    Hangi constructor kullanacağım parametre sayısı arttıkça zorlaşıyor ve takibi de zor.
     */

    /*
    Eğer ben set metotları ile boş constructor oluşturup atama yaparsam buda Java Beans oluyor. Tabi buradaki sorun
    benim için zorundalık yok.
     */
    public Room(String roomName, int size, int windowCount) {
        this.roomName = roomName;
        this.size = size;
        this.windowCount = windowCount;
    }

    public Room(String roomName, int size, int windowCount, boolean bed) {
        this(roomName, size, windowCount);
        this.bed = bed;
    }

    public Room(String roomName, int size, int windowCount, boolean bed, boolean studyDesk) {
        this(roomName, size, windowCount);
        this.bed = bed;
        this.studyDesk = studyDesk;
    }

    public Room(String roomName, int size, int windowCount, boolean bed, boolean studyDesk, int deskCount) {
        this(roomName, size, windowCount);
        this.bed = bed;
        this.studyDesk = studyDesk;
        this.deskCount = deskCount;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public void setWindowCount(int windowCount) {
        this.windowCount = windowCount;
    }

    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    public boolean isStudyDesk() {
        return studyDesk;
    }

    public void setStudyDesk(boolean studyDesk) {
        this.studyDesk = studyDesk;
    }

    public int getDeskCount() {
        return deskCount;
    }

    public void setDeskCount(int deskCount) {
        this.deskCount = deskCount;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", size=" + size +
                ", windowCount=" + windowCount +
                ", bed=" + bed +
                ", studyDesk=" + studyDesk +
                ", deskCount=" + deskCount +
                '}';
    }
}
