package Urun_Odev;

public class UrunParent {
    /*
    altında

    1.bilgisayar
    2.mobilya
    3.beyaz esya
    4.giyim

    default parametreleri belirle(urun parentta)--> neler atanmış olmalı bir ürün oluştuğunda(internetten incele)ve ata

    default ve parametreli constructorlarını yazın

     */
//todo odevi yap

    private int id;
    private int cost;



    UrunParent(int cost) {
        id =(int) (Math.random()*100);
      this.cost = cost;
    }


    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    private void setCost(int cost) {
        this.cost = cost;
    }

}
