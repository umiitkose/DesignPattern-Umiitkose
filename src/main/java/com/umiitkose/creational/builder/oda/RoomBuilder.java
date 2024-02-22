package com.umiitkose.creational.builder.oda;
/*
 * Created by umitkose
 * 6.11.2021 - 14:16
 */

public class RoomBuilder {


    //gerekli olan parametrelerimiz
    private final String roomName;
    private final int size;
    private final int windowCount;

    //opsiyonel parametreler
    private final boolean isBed;
    private final boolean isStudyDesk;
    private final int deskCount;

    private RoomBuilder(Builder builder) {
        roomName = builder.roomName;
        size = builder.size;
        windowCount = builder.windowCount;
        isBed = builder.isBed;
        isStudyDesk = builder.isStudyDesk;
        deskCount = builder.deskCount;
    }

    public static class Builder {

        /* code tekrarı oluşması zararımıza..*/
        //gerekli olan parametrelerimiz
        private final String roomName;
        private final int size;
        private final int windowCount;

        //opsiyonel parametreler
        private boolean isBed;
        private boolean isStudyDesk;
        private int deskCount;

        public Builder(String roomName, int size, int windowCount) {
            this.roomName = roomName;
            this.size = size;
            this.windowCount = windowCount;
        }

        public Builder isBed(boolean isBed) {
            this.isBed = isBed;
            return this;
        }

        public Builder isStudyDesk(boolean isStudyDesk) {
            this.isStudyDesk = isStudyDesk;
            return this;
        }

        public Builder deskCount(int deskCountLocal) {
            deskCount = deskCountLocal;
            return this;
        }

        public RoomBuilder build() {
            return new RoomBuilder(this);
        }

    }

    @Override
    public String toString() {
        return "RoomBuilder{" +
                "roomName='" + roomName + '\'' +
                ", size=" + size +
                ", windowCount=" + windowCount +
                ", isBed=" + isBed +
                ", isStudyDesk=" + isStudyDesk +
                ", deskCount=" + deskCount +
                '}';
    }
}
