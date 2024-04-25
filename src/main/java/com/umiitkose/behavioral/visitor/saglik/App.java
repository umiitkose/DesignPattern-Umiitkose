package com.umiitkose.behavioral.visitor.saglik;


import com.umiitkose.behavioral.visitor.saglik.islemler.*;
import com.umiitkose.behavioral.visitor.saglik.saglikbakanligi.*;

public class App {

    public static void main(String[] args) {

        Hasta ahmet = new Hasta("Ahmet", EnumHastalik.COVID, EnumHastaDurum.OLUM);
        Hasta umit = new Hasta("Ümit", EnumHastalik.COVID, EnumHastaDurum.AGIR_HASTA);
        Hasta mehmet = new Hasta("Mehmet", EnumHastalik.COVID, EnumHastaDurum.EVDE_KARANTINA);
        Hasta veli = new Hasta("Veli", EnumHastalik.COVID, EnumHastaDurum.IYILESTI);
        Hasta hakki = new Hasta("Hakkı", EnumHastalik.COVID, EnumHastaDurum.IYILESTI);
        Hasta orhan = new Hasta("Orhan", EnumHastalik.COVID, EnumHastaDurum.ZATURRE);

        Hastane capa = new Hastane("Çapa");
        capa.hastaEkle(ahmet);
        capa.hastaEkle(umit);
        capa.hastaEkle(mehmet);
        capa.hastaEkle(veli);
        capa.hastaEkle(hakki);
        capa.hastaEkle(orhan);

        Il il = new Il("İstanbul");
        il.hastaEkle(capa);


        Ulke turkiye = new Ulke("Turkiye");
        turkiye.ilEkle(il);

        raporUlke(turkiye);
    }

    private static void raporUlke(Ulke turkiye) {

        CovidHastaSayisiVisitor covidHastaSayisiVisitor = new CovidHastaSayisiVisitor();
        System.out.println("Hasta Sayisi  -->" + covidHastaSayisiVisitor.visitUlke(turkiye));
        CovidOlumSayisiVisitor covidOlumSayisiVisitor = new CovidOlumSayisiVisitor();
        System.out.println("Ölüm Sayisi  -->" + covidOlumSayisiVisitor.visitUlke(turkiye));
        CovidIyilesenSayisiVisitor covidIyilesenSayisiVisitor = new CovidIyilesenSayisiVisitor();
        System.out.println("İyileşen Sayisi  -->" + covidIyilesenSayisiVisitor.visitUlke(turkiye));
        CovidZaturreSayisiVisitor covidZaturreSayisiVisitor = new CovidZaturreSayisiVisitor();
        System.out.println("Zaturre Sayisi -->" + covidZaturreSayisiVisitor.visitUlke(turkiye));
        CovidAgirHastaSayisiVisitor covidAgirHastaSayisiVisitor = new CovidAgirHastaSayisiVisitor();
        System.out.println("Zaturre Sayisi -->" + covidAgirHastaSayisiVisitor.visitUlke(turkiye));
    }
}
