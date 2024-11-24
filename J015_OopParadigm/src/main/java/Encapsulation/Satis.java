package Encapsulation;

public class Satis {
    private int satisId;
    private String satisName;
    private int satisDate;
    private String satisAddress;
    private String satisPhone;
    private String satisEmail;


    @Override
    public String toString() {
        return "Satis{" +
                "satisId=" + satisId +
                ", satisName='" + satisName + '\'' +
                ", satisDate=" + satisDate +
                ", satisAddress='" + satisAddress + '\'' +
                ", satisPhone='" + satisPhone + '\'' +
                ", satisEmail='" + satisEmail + '\'' +
                '}';
    }

    public Satis() {
    }

    public Satis(int satisId, String satisEmail, String satisPhone, String satisAddress, String satisName, int satisDate) {
        this.satisId = satisId;
        this.satisEmail = satisEmail;
        this.satisPhone = satisPhone;
        this.satisAddress = satisAddress;
        this.satisName = satisName;
        this.satisDate = satisDate;
    }

    public int getSatisId() {
        return satisId;
    }

    public void setSatisId(int satisId) {
        this.satisId = satisId;
    }

    public String getSatisName() {
        return satisName;
    }

    public void setSatisName(String satisName) {
        this.satisName = satisName;
    }

    public int getSatisDate() {
        return satisDate;
    }

    public void setSatisDate(int satisDate) {
        this.satisDate = satisDate;
    }

    public String getSatisAddress() {
        return satisAddress;
    }

    public void setSatisAddress(String satisAddress) {
        this.satisAddress = satisAddress;
    }

    public String getSatisPhone() {
        return satisPhone;
    }

    public void setSatisPhone(String satisPhone) {
        this.satisPhone = satisPhone;
    }

    public String getSatisEmail() {
        return satisEmail;
    }

    public void setSatisEmail(String satisEmail) {
        this.satisEmail = satisEmail;
    }


}
