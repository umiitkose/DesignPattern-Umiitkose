package com.umiitkose.behavioral.visitor.saglik.saglikbakanligi;

import java.util.ArrayList;
import java.util.List;

public class Il {

    private String adi;
    private List<Hastane> hastaneList;

    public Il(String adi) {
        this.adi = adi;
        hastaneList = new ArrayList<>();
    }

    public String accept(Visitor visitor) {
        return visitor.visitIl(this);
    }


    public void hastaEkle(Hastane hastane) {
        hastaneList.add(hastane);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Hastane> getHastaneList() {
        return hastaneList;
    }

    public void setHastaneList(List<Hastane> hastaneList) {
        this.hastaneList = hastaneList;
    }
}

