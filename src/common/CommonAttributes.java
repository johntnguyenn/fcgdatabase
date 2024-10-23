package common;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonAttributes {
   
    public static String Username = "root";
    public static String Password  = "fcgdbadmin";
    private String Departments[] = { "DAU TU" ,"DU LICH", "DU HOC", "BL TEAM 1", "BL TEAM 2", "KET HON" };
    private String Offices[] = { "Garden Grove" ,"San Jose" };

    public String[] getDepartments() {
        return Departments;
    }

    public String[] getOffices() {
        return Offices;
    }
    
    
    public String[] getCategoriesByDepartment(String department){
    
        if(department.equals("DAU TU")){
        
            String Categories[] = {"L1", "L1 Renew", "EB1C, EB5", "EB3", "Other"};
            return Categories;
            
        }else if(department.equals("DU LICH")){
        
            String Categories[] = {"B-2 Extend", "B-2 Renew", "B1-B2"};
            return Categories;
            
        }else if(department.equals(" DU HOC")){
        
            String Categories[] = {"F1", "B2-F1", "Reinstatement"};
            return Categories;
          
        }else if(department.equals("BL TEAM 1")){
        
            String Categories[] = {"IR5", "F4", "RC", "N400", "N600", "I-90", "I-131", "I-751"};
            return Categories;
            
        }else if(department.equals("BL TEAM 2")){
        
            String Categories[] = {"F1", "F2A (BLC)", "F2B", "F3", "IR2", "CR2", "I-601", "Nhan Dao", "ADJ"};
            return Categories;
            
        }else if(department.equals("KET HON")){
        
            String Categories[] = {"F2A(KH)", "CR1", "IR1", "Passport Con", "K1"};
            return Categories;
            
        }else{
        
            String Categories[] = {"Select department first"};
            return Categories;
        }
        
    }
        public String[] getStagesByDepartmentAndCategory(String department, String category){
    
        if(department.equals("DAU TU")){
        
            String Stages[] = {"USCIS", "CONSULATE"};
            return Stages;
            
        }else if(department.equals("DU LICH")){
              
            if(category.equals("B-2 Extend")){

                String Stages[] = {"USCIS"};
                return Stages;
            }
            if(category.equals("B-2 Renew") || category.equals("B1-B2")){

                String Stages[] = {"CONSULATE"};
                return Stages;
            }else{
            
                String Stages[] = {"Select Category first"};
                return Stages;
            }
            
        }else if(department.equals(" DU HOC")){
        
            if(category.equals("F1")){
                String Stages[] = {"CONSULATE"};
                return Stages;
            }else{
                String Stages[] = {"USCIS"};
                return Stages;
            }
          
        }else if(department.equals("BL TEAM 1")){
           
            if(category.equals("IR5") || category.equals("F4")){
                String Stages[] = {"NVC","CONSULATE"};
                return Stages;
            }else{
                String Stages[] = {"USCIS"};
                return Stages;
            }
           
        }else if(department.equals("BL TEAM 2")){
        
            String Stages[] = {"USCIS", "NVC", "CONSULATE"};
            return Stages;
            
        }else if(department.equals("KET HON")){
        
            String Stages[] = {"USCIS", "NVC", "CONSULATE"};
            return Stages;
            
        }else{
        
            String Stages[] = {"Select department first"};
            return Stages;
        }
        }
        
        public  String[] getStatusOfStageAndStory(String stage, String category){
        
            if(stage.equalsIgnoreCase("USCIS")){
                String status[] = {"Signed Contract", "Collecting Info", "Working on the case", "TL Reviewing", "Waiting on Signature", "Combining", "Sent out",
                               "Tracking","RFE", "Deny", "Approve", "Responded to RFE"};
                return status;
                
            }else if(stage.equalsIgnoreCase("USCIS") && (category.equals("EB1C") || category.equals("EB3"))){
                String status[] = {"Signed Contract", "Collecting Info", "Working on the case", "TL Reviewing", "Waiting on Signature", "Combining", "Sent out",
                               "Tracking","RFE", "Deny", "Approve", "Responded to RFE", "I-140 Approve"};
                return status;
            
            }else if(stage.equalsIgnoreCase("USCIS") && (category.equals("EB5"))){
                String status[] = {"Signed Contract", "Collecting Info", "Working on the case", "TL Reviewing", "Waiting on Signature", "Combining", "Sent out",
                               "Tracking","RFE", "Deny", "Approve", "Responded to RFE", "I-526 Approve"};    
                return status;
           
            }else if(stage.equalsIgnoreCase("USCIS") && (category.equals("EB1C") || category.equals("EB3") || category.equals("EB5"))){
                String status[] = {"Signed Contract", "Collecting Info", "Working on the case", "TL Reviewing", "Waiting on Signature", "Combining", "Sent out",
                               "Tracking","RFE", "Deny", "Approve", "Responded to RFE", "Filing I-485","Interview"};    
                return status;
            }else if(stage.equalsIgnoreCase("CONSULATE")){
                String status[] = {"DS-160", "Interview Schedule","Interview Instruction", "Visa/Investigating/Deny", "Complete"};
                return status;
            }else{
                String status[] = {""};
                return status;
                
            }
        }
        public  String[] getNotify(){
            
            String notify[] = {"IR5/F4", "I-751/I-90/I-131/N-600","RFE/INTENT TO DENY/APPEAL"};
            return notify;
        }
     
        public static String getCurrentDate(){
        
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
            LocalDateTime now = LocalDateTime.now();  
            
            return dtf.format(now);  
        }
   
        public static String getCurrentDateTime(){
        
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
            LocalDateTime now = LocalDateTime.now();  
            
            return dtf.format(now);  
        }
 
        public static long dateDifference(String date1, String date2){
        
            LocalDate d1 = LocalDate.parse(date1,  DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate d2 = LocalDate.parse(date2,  DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
            long diffDays = diff.toDays();
            
            return diffDays;
        }
 
    
}
