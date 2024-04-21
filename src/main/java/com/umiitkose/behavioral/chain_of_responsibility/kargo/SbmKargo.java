package com.umiitkose.behavioral.chain_of_responsibility.kargo;

public class SbmKargo {

    public static KargoSirketi getKargoSirketi() {

        CankiriSube cankiriSube = new CankiriSube();

        AnkaraSube ankaraSube = new AnkaraSube();

        IstanbulSube istanbulSube = new IstanbulSube();

        AntalyaSube antalyaSube = new AntalyaSube();

        return cankiriSube.setSonrakiKargoSirketi(ankaraSube.setSonrakiKargoSirketi(istanbulSube.setSonrakiKargoSirketi(antalyaSube)));

    }
}
