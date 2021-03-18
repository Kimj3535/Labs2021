package com.example.labs2021;

public class Message {
    protected long id;

    public String chatMessage;

    public Boolean isSent;

    public Message(String text, Boolean chatType, long i){
        this.chatMessage = text;
        this.isSent = chatType;
        this.id = i;
    }
    public void update(String text, Boolean chatType){
        chatMessage = text;
        isSent = chatType;
    }
    public Message(String text, Boolean chatType){ this(text, chatType, 0); }

    public String getChatMessage(){
        return chatMessage;
    }

    public Boolean getChatType(){
        return isSent;
    }

    public long getId() { return id; }


}



