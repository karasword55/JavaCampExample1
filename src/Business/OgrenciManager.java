package Business;

import Model.Ogrenci;

import java.util.ArrayList;

public class OgrenciManager {

    ArrayList<Ogrenci> ogrenciListesi=new ArrayList<>();

    public void ogrenciEkle(String ogrenciIsmi){
        Ogrenci ogrenci=new Ogrenci(ogrenciIsmi);
        ogrenciListesi.add(ogrenci);

    }
    public void ogrenciListesiGoster(){
        for (Ogrenci ogrenci:ogrenciListesi) {
            System.out.println(ogrenci.getOgrenciIsmi());
        }
    }

}
