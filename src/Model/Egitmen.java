package Model;

import java.util.ArrayList;

public class Egitmen {
    String egitmenIsmi;
    public ArrayList<Kurs> egitmeninKursListesi;


    public Egitmen(String egitmenIsmi) {
        this.egitmenIsmi = egitmenIsmi;


    }
    public Egitmen(String egitmenIsmi,ArrayList<Kurs> egitmeninKursListesi) {
        this.egitmenIsmi = egitmenIsmi;
        this.egitmeninKursListesi=egitmeninKursListesi;
    }


    public String getEgitmenIsmi() {
        return egitmenIsmi;
    }

    public void setEgitmenIsmi(String egitmenIsmi) {
        this.egitmenIsmi = egitmenIsmi;
    }


}
