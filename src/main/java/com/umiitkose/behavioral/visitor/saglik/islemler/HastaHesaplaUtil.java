package com.umiitkose.behavioral.visitor.saglik.islemler;


import com.umiitkose.behavioral.visitor.saglik.saglikbakanligi.EnumHastaDurum;
import com.umiitkose.behavioral.visitor.saglik.saglikbakanligi.EnumHastalik;
import com.umiitkose.behavioral.visitor.saglik.saglikbakanligi.Hasta;
import com.umiitkose.behavioral.visitor.saglik.saglikbakanligi.Hastane;

import java.util.List;

public class HastaHesaplaUtil {

    public static int hastaSayisiHesapla(Hastane hastane, EnumHastalik hastalik) {

        List<Hasta> hastaList = hastane.getHastaList();

        int hastaSayisi = 0;
        for (Hasta hasta : hastaList) {
            if (hastalik.equals(hasta.getHastalik())) {
                hastaSayisi++;
            }
        }
        return hastaSayisi;
    }

    public static int hastaSayisiHesapla(Hastane hastane, EnumHastalik hastalik, EnumHastaDurum hastaDurum) {

        List<Hasta> hastaList = hastane.getHastaList();

        int hastaSayisi = 0;
        for (Hasta hasta : hastaList) {
            if (hastalik.equals(hasta.getHastalik())) {
                if (hastaDurum.equals(hasta.getDurum())) {
                    hastaSayisi++;
                }
            }
        }
        return hastaSayisi;
    }

}
