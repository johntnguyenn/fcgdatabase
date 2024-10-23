package controllers;

import connections.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.CaseHistory;
import models.Client;
import models.CurrentStatus;

public class ClientController {
    
    Connection connection = new DBConnection().getConnection();
    
    public int addClient(Client client){
    
        int added = 0;
        try
        {
            String query = "insert into clientInfo (department, office, category, stage, petitioner, state, usPhone, usEmail, beneficiary, vnPhone, vnEmail, receipt, priorityDate, feeBillNumber, takeCareBy, contractFee, paid,createdDate, caseStatus, status)"
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, client.getDepartment());
            preparedStatement.setString(2, client.getOffice());
            preparedStatement.setString(3, client.getCategory());
            preparedStatement.setString(4, client.getStage());
            preparedStatement.setString(5, client.getPetitioner());
            preparedStatement.setString(6, client.getState());
            preparedStatement.setString(7, client.getUsPhone());
            preparedStatement.setString(8, client.getUsEmail());
            preparedStatement.setString(9, client.getBeneficiary());
            preparedStatement.setString(10, client.getVnPhone());
            preparedStatement.setString(11, client.getVnEmail());
            preparedStatement.setString(12, client.getReceipt());
            preparedStatement.setString(13, client.getPriorityDate());
            preparedStatement.setInt(14, client.getFeeBillNumber());
            preparedStatement.setString(15, client.getTakeCareBy());
            preparedStatement.setDouble(16, client.getContractFee());
            preparedStatement.setDouble(17, client.getPaid());
            preparedStatement.setString(18, client.getCreatedDate());
            preparedStatement.setString(19, client.getCaseStatus());
            preparedStatement.setInt(20, 1);
            
           added = preparedStatement.executeUpdate();

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to add client informations, \nPlese Check Database connection");
        }
        
        return added;
    }
    
    public List<Client> getAllClients(){
    
        List<Client> clients = new ArrayList<>();
        try{
 
            String query = "Select * from clientinfo where status = 1";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Client client = new Client( resultSet.getString("department"), resultSet.getString("office"), resultSet.getString("category"), resultSet.getString("stage"), resultSet.getString("petitioner"), resultSet.getString("state"), resultSet.getString("usPhone"), resultSet.getString("usEmail"), resultSet.getString("beneficiary"), resultSet.getString("vnPhone"), resultSet.getString("vnEmail"), resultSet.getString("receipt"), resultSet.getString("priorityDate"), resultSet.getInt("feeBillNumber"), resultSet.getString("takeCareBy"), resultSet.getDouble("contractFee"), resultSet.getDouble("paid"), resultSet.getString("createdDate"), resultSet.getString("caseStatus"));
                client.setId(resultSet.getInt("Id"));
                clients.add(client);
            }
            
        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to view client information, \nPlese Check Database connection");
        }
        
        return clients;
        
    }
    
     public Client getClientById(int Id){
    
        Client client = null;
        try{
 
            String query = "Select * from clientinfo where status = 1 AND Id =?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, Id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Client cl = new Client( resultSet.getString("department"), resultSet.getString("office"), resultSet.getString("category"), resultSet.getString("stage"), resultSet.getString("petitioner"), resultSet.getString("state"), resultSet.getString("usPhone"), resultSet.getString("usEmail"), resultSet.getString("beneficiary"), resultSet.getString("vnPhone"), resultSet.getString("vnEmail"), resultSet.getString("receipt"), resultSet.getString("priorityDate"), resultSet.getInt("feeBillNumber"), resultSet.getString("takeCareBy"), resultSet.getDouble("contractFee"), resultSet.getDouble("paid"),resultSet.getString("createdDate"), resultSet.getString("caseStatus"));
                cl.setId(resultSet.getInt("Id"));
                client = cl;
            }
            
        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to view client information, \nPlese Check Database connection");
        }
        
        return client;
    }
     
     public int deleteClient(int id){
    
        int deleted = 0;
        try
        {
            String query = "update clientInfo set status = 0 where Id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            deleted = preparedStatement.executeUpdate();

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to delete client informations, \nPlese Check Database connection");
        }
        
        return deleted;
    }
    
     public int updateClient(Client client){
    
        int updated = 0;
        try
        {
            String query = "update clientInfo set department =? , office=? , category=?, stage=?, petitioner=?, state=?, usPhone=?, usEmail=?, beneficiary=?, vnPhone=?, vnEmail=?, receipt=?, priorityDate=?, feeBillNumber=?, takeCareBy=?, contractFee=?, paid=?, caseStatus=? where Id =?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, client.getDepartment());
            preparedStatement.setString(2, client.getOffice());
            preparedStatement.setString(3, client.getCategory());
            preparedStatement.setString(4, client.getStage());
            preparedStatement.setString(5, client.getPetitioner());
            preparedStatement.setString(6, client.getState());
            preparedStatement.setString(7, client.getUsPhone());
            preparedStatement.setString(8, client.getUsEmail());
            preparedStatement.setString(9, client.getBeneficiary());
            preparedStatement.setString(10, client.getVnPhone());
            preparedStatement.setString(11, client.getVnEmail());
            preparedStatement.setString(12, client.getReceipt());
            preparedStatement.setString(13, client.getPriorityDate());
            preparedStatement.setInt(14, client.getFeeBillNumber());
            preparedStatement.setString(15, client.getTakeCareBy());
            preparedStatement.setDouble(16, client.getContractFee());
            preparedStatement.setDouble(17, client.getPaid());
            preparedStatement.setString(18, client.getCaseStatus());
            preparedStatement.setInt(19, client.getId());
            
           updated = preparedStatement.executeUpdate();

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to edit client informations, \nPlese Check Database connection");
        }
        
        return updated;
    }
     
     public int getClientId(){
    
        int id =0;
        try{
 
            String query = "select Id from clientinfo Order by id DESC limit 1";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
            
                id = resultSet.getInt("Id");
                
            }
            
        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to view client id, \nPlese Check Database connection");
        }
        
        return id;
    }
     
    public int AddStatus(CurrentStatus status){
       int added = 0;
        try
        {
            String query = "insert into currentStatus (clientId, status, notify, deadlineDays, lastUpdated, note, deadlineDate)"
                    + "values (?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, status.getClientId());
            preparedStatement.setString(2, status.getStatus());
            preparedStatement.setString(3, status.getNotify());
            preparedStatement.setInt(4, status.getDeadlineDays());
            preparedStatement.setString(5, status.getLastUpdated());
            preparedStatement.setString(6, status.getNote());
            preparedStatement.setString(7, status.getDeadlineDate());
            added = preparedStatement.executeUpdate();

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to adding status, \nPlese Check Database connection");
        }
        
        return added;
        
    }
     public CurrentStatus getClientStatusById(int Id){
    
        CurrentStatus status = null;
        try{
 
            String query = "Select * from currentstatus where clientId = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, Id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                CurrentStatus CStatus = new CurrentStatus(resultSet.getInt("clientId"),resultSet.getString("status"),resultSet.getString("notify"), resultSet.getInt("deadlineDays"),resultSet.getString("deadlineDate"),resultSet.getString("lastUpdated"), resultSet.getString("note"));
                CStatus.setStatusId(resultSet.getInt("Id"));
                status = CStatus;
            }
            
        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to view client status, \nPlese Check Database connection");
        }
        
        return status;
    }
        public int updateCurrentStatus(CurrentStatus status){
    
        int updated = 0;
        try
        {
            String query = "update currentstatus set status = ?, notify =?, deadlineDays =?, lastUpdated =?, note=?, deadlineDate =? where Id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, status.getStatus());
            preparedStatement.setString(2, status.getNotify());
            preparedStatement.setInt(3, status.getDeadlineDays());
            preparedStatement.setString(4, status.getLastUpdated());
            preparedStatement.setString(5, status.getNote());
            preparedStatement.setString(6, status.getDeadlineDate());
            preparedStatement.setInt(7, status.getStatusId());
            
            
            updated = preparedStatement.executeUpdate();

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to updated client current status, \nPlese Check Database connection");
        }
        
        return updated;
    }
        
     public int AddCaseHistory(CaseHistory history){
       int added = 0;
        try
        {
            String query = "insert into casehistory (clientId, editedBy, comments, lastUpdated)"
                    + "values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, history.getClientId());
            preparedStatement.setString(2, history.getEditedBy());
            preparedStatement.setString(3, history.getComments());
            preparedStatement.setString(4, history.getLastUpdated());
            ;
            
            added = preparedStatement.executeUpdate();

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to adding case history, \nPlese Check Database connection");
        }
        
        return added;
        
    }
     
      public List<CaseHistory> getClientCaseHistory(int Id){
    
        List<CaseHistory> histories = new ArrayList<>();
        try{
 
            String query = "Select * from casehistory where clientId = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, Id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                CaseHistory History = new CaseHistory(resultSet.getInt("clientId"),resultSet.getString("editedBy"),resultSet.getString("comments"), resultSet.getString("lastUpdated"));
                histories.add(History);
            }
            
        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Something went wrong when try to view case history, \nPlese Check Database connection");
        }
    
        return histories;
    
      }
}