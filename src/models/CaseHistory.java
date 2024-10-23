package models;
 class CaseHistory {
 
    private int historyId;
    private int clientId;
    private String editedBy;
    private String comments;
    private String lastUpdated;

    public CaseHistory(int clientId, String editedBy, String comments, String lastUpdated) {
        this.clientId = clientId;
        this.editedBy = editedBy;
        this.comments = comments;
        this.lastUpdated = lastUpdated;
    }

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getEditedBy() {
        return editedBy;
    }

    public void setEditedBy(String editedBy) {
        this.editedBy = editedBy;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    
    
}
