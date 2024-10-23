package models;

public class CurrentStatus {
    
    private int statusId;
    private int clientId;
    private String status;
    private String notify;
    private int deadlineDays;
    private String deadlineDate;
    private String lastUpdated;
    private String note;

    public CurrentStatus(int clientId, String status, String notify, int deadlineDays, String deadlineDate, String lastUpdated, String note) {
        this.clientId = clientId;
        this.status = status;
        this.notify = notify;
        this.deadlineDays = deadlineDays;
        this.lastUpdated = lastUpdated;
        this.note = note;
        this.deadlineDate = deadlineDate;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public int getDeadlineDays() {
        return deadlineDays;
    }

    public void setDeadlineDays(int deadlineDays) {
        this.deadlineDays = deadlineDays;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }
    
    
    
            
}
