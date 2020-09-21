package com.notfound.swolider.base;

import java.util.Map;

public class ErrorResponse {
    private String status;
    private Map<String, String> messages;

    public ErrorResponse() {
    }

    public ErrorResponse( Map<String, String> messages) {
        this.status = "error";
        this.messages = messages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, String> getMessages() {
        return messages;
    }

    public void setMessages(Map<String, String> messages) {
        this.messages = messages;
    }
}
