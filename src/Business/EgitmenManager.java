package Business;

import Model.Egitmen;
import Model.Kurs;

import java.util.ArrayList;

public class EgitmenManager {
    ArrayList<Egitmen> egitmenList=new ArrayList<>();
    ArrayList<Kurs> kursListesi=new ArrayList<>();
    public static Egitmen egitmen;

    public void egitmenListesi(){
        for (Egitmen egitmen:egitmenList) {
            System.out.println(egitmen.getEgitmenIsmi());
        }
    }
    public void egitmenEkle(String isim){
        egitmen=new Egitmen(isim);
        egitmenList.add(egitmen);

    }
    public void egitmeneKursEkle(Egitmen egitmen,Kurs kurs){
        //kursListesi=egitmen.egitmeninKursListesi;
        egitmen.egitmeninKursListesi.add(kurs);
    }
    public void egitmeninKurslariniListele(Egitmen egitmen){
        kursListesi=egitmen.egitmeninKursListesi;
        for (Kurs kurs:kursListesi) {
            System.out.println(kurs.getKursIsmi());
        }
    }
}
