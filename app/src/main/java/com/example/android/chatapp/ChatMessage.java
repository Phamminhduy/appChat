package com.example.android.chatapp;

import com.google.firebase.database.Exclude;

/**
 * Created by phamm on 12/7/2017.
 */

public class ChatMessage {
    private String message;
    private String sender;
    private String recipient;

    private int mRecipientOrSenderStatus;

    public ChatMessage() {
    }

    public ChatMessage(String message, String sender, String recipient) {
        this.message = message;
        this.recipient = recipient;
        this.sender = sender;
    }


    public void setRecipientOrSenderStatus(int recipientOrSenderStatus) {
        this.mRecipientOrSenderStatus = recipientOrSenderStatus;
    }


    public String getMessage() {
        return message;
    }

    public String getRecipient(){
        return recipient;
    }

    public String getSender(){
        return sender;
    }

    @Exclude
    public int getRecipientOrSenderStatus() {
        return mRecipientOrSenderStatus;
    }
}
