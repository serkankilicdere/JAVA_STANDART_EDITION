package BankaMusteri;

public class Musteri {
    /*
    bir banka için müşteriye ait tutulmasi gereken tüm bilgilieri
    içeren müsteri sınıfını olusturunuz
     */

   public String ad;
   public String soyad;
   public String adres;
   private String telNo;
   private String tcNo;

   public void tcNoyaz(String tcNo){
      this.tcNo = tcNo;

   }

   public void telNoyaz(String telNo){
      this.telNo = telNo;
   }

   public String tcNo(){
      return tcNo;
   }
   public String telNo(){
      return telNo;
   }

































}
