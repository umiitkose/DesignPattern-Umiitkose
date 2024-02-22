package com.umiitkose.oop.softwareprinciple.coupling.tight;

public class Surucu {
    Otomobil otomobil;

    public Surucu() {
        otomobil = new Otomobil();
    }

    public void aracSur() {
        otomobil.calistir();
        otomobil.ilerle();
    }

    public void araciDurdur() {
        otomobil.durdur();
    }

}

/**
 * Otomobil sınıfı olmadan Surucu sınıfı hiçbir işe yaramaz. Tamamiyle otomobil sınıfına sıkı sıkıya bağlıdır.
 * Herhangi bir yerde sürücü sınıfı çağırıldığında otomobil sınıfıda çağırılıyor.
 * Otomobil sınıfındaki değişiklik sürücü sınıfını etkiliyor.
 * Sürücü sınıfında değişiklik yapılmak istediğimizde (Örneğin tır sür) kullanılamayacak. Koşullara göre eklemeler yapılabilir
 * ama yazılım prensiplerini ihlali çok açıktır.
 **/