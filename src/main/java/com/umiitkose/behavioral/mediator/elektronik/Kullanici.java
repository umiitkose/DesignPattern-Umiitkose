package com.umiitkose.behavioral.mediator.elektronik;

public class Kullanici {

    //http://www.tasarimdesenleri.com/jsp/tasdesincele/mediator.jsp -> alinmıştır.
    public static void main( final String[] args ) {
        // Arabulu sınıf yaratılır.
        final Arabulucu arabulucu = new Arabulucu();

        // Arabulucu sınıfı içeren nesneler yaratılıyor ve bir
        // dizine ekleniyor. Bu nesneler arasındaki haberleşmeyi
        // ortak Arabulucu sınıf sağlayacak.
        final ElektronikAygit[] aygıtlar = new ElektronikAygit[ 3 ];
        aygıtlar[ 0 ] = new Bilgisayar( arabulucu );
        aygıtlar[ 1 ] = new Televizyon( arabulucu );
        aygıtlar[ 2 ] = new Radyo( arabulucu );

        // Her bir aygıtı çalıştır.
        for ( final ElektronikAygit aygıt : aygıtlar ) {
            aygıt.calistir();
        }
    }
}
