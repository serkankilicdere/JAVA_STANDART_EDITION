package Urun_Odev;

import HepsiBuradaOrnekUyg.Urun;

public class RunnerUrun {
    public static void main(String[] args) {

Mobilya mobilya = new Mobilya("blue","wood");


        System.out.println(mobilya.getCost());
        System.out.println(mobilya.getId());
        System.out.println(mobilya.getMaterial());
        System.out.println(mobilya.getColor());
    }
}
