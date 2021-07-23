package com.exquisApp.dataingester.models;

public class SecurityReview {
    private String clientId;
    private String intrusionAttempt;
    private String source;
    private boolean status;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getIntrusionAttempt() {
        return intrusionAttempt;
    }

    public void setIntrusionAttempt(String intrusionAttempt) {
        this.intrusionAttempt = intrusionAttempt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SecurityReview{" +
                "clientId='" + clientId + '\'' +
                ", intrusionAttempt='" + intrusionAttempt + '\'' +
                ", source='" + source + '\'' +
                ", status=" + status +
                '}';
    }
}
