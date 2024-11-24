package Urun_Odev;

public class Mobilya extends UrunParent{
    private String color;
    private String material;




    Mobilya(String color, String material){
        super(500);

        this.color = color;
        this.material = material;

    }

    public String getColor() {
        return color;
    }



    public String getMaterial() {
        return material;
    }
}
