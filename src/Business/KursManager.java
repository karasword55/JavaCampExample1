package Business;

import Model.Kurs;

import java.util.ArrayList;

public class KursManager {
    ArrayList<Kurs> kursListesi=new ArrayList<>();
    public void addKurs(String kursIsmi){
        Kurs kurs=new Kurs(kursIsmi);
        kursListesi.add(kurs);
    }
    public void kurslariGoster(){
        for (Kurs kurs:kursListesi) {
            System.out.println(kurs.getKursIsmi());
        }
    }
}
