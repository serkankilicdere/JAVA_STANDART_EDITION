package Anakart;

public class AnakartSatis {
    public static void main(String[] args) {

       AnaKart[] anakartListesi = new AnaKart[6];

      AnaKart anakart001=new AnaKart();
      anakart001.setMarka("asus");
      anakart001.setBoyut("atx");
      anakart001.setSocket("intel");
      anakart001.setChipSet("vert");


      anakartListesi[0]=anakart001;


        for (AnaKart anaKart : anakartListesi) {
          System.out.println(anaKart.getBoyut());
        }


    }//END OF MAIN METHOD
}//END OF CLASS
