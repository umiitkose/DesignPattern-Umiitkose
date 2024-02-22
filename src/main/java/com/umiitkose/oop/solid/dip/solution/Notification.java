package com.umiitkose.oop.solid.dip.solution;

import com.umiitkose.oop.solid.dip.problem.Email;
import com.umiitkose.oop.solid.dip.problem.SMS;

import java.util.List;

public class Notification {
    List<Message> messageList;

    public Notification(List<Message> messageList) {
        this.messageList = messageList;
    }

    public void sendMessage() {
        messageList.forEach(Message::sendMessage);
    }
}
