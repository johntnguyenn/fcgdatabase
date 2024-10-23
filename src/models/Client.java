package models;

public class Client {
    private int id;
    private String department;
    private String office;
    private String category;
    private String stage;
    private String petitioner;
    private String state;
    private String usPhone;
    private String usEmail;
    private String beneficiary;
    private String vnPhone;
    private String vnEmail;
    private String receipt;
    private String priorityDate;
    private int    feeBillNumber;
    private String takeCareBy;
    private double contractFee;
    private double paid;
    private String createdDate;
    private String caseStatus;

    public Client(String department, String office, String category, String stage, String petitioner, String state, String usPhone, String usEmail, String beneficiary, String vnPhone, String vnEmail, String receipt, String priorityDate, int feeBillNumber, String takeCareBy, double contractFee, double paid,String createdDate, String caseStatus) {
        this.department = department;
        this.office = office;
        this.category = category;
        this.stage = stage;
        this.petitioner = petitioner;
        this.state = state;
        this.usPhone = usPhone;
        this.usEmail = usEmail;
        this.beneficiary = beneficiary;
        this.vnPhone = vnPhone;
        this.vnEmail = vnEmail;
        this.receipt = receipt;
        this.priorityDate = priorityDate;
        this.feeBillNumber = feeBillNumber;
        this.takeCareBy = takeCareBy;
        this.contractFee = contractFee;
        this.paid = paid;
        this.createdDate = createdDate;
        this.caseStatus = caseStatus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getPetitioner() {
        return petitioner;
    }

    public void setPetitioner(String petitioner) {
        this.petitioner = petitioner;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUsPhone() {
        return usPhone;
    }

    public void setUsPhone(String usPhone) {
        this.usPhone = usPhone;
    }

    public String getUsEmail() {
        return usEmail;
    }

    public void setUsEmail(String usEmail) {
        this.usEmail = usEmail;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getVnPhone() {
        return vnPhone;
    }

    public void setVnPhone(String vnPhone) {
        this.vnPhone = vnPhone;
    }

    public String getVnEmail() {
        return vnEmail;
    }

    public void setVnEmail(String vnEmail) {
        this.vnEmail = vnEmail;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getPriorityDate() {
        return priorityDate;
    }

    public void setPriorityDate(String priorityDate) {
        this.priorityDate = priorityDate;
    }

    public int getFeeBillNumber() {
        return feeBillNumber;
    }

    public void setFeeBillNumber(int feeBillNumber) {
        this.feeBillNumber = feeBillNumber;
    }

    public String getTakeCareBy() {
        return takeCareBy;
    }

    public void setTakeCareBy(String takeCareBy) {
        this.takeCareBy = takeCareBy;
    }

    public double getContractFee() {
        return contractFee;
    }

    public void setContractFee(double contractFee) {
        this.contractFee = contractFee;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }   
}
