package com.umiitkose.creational.prototype.person;

public class Iletisim implements Cloneable{
    private String ceptel;
    private String email;

    public Iletisim(String ceptel, String email) throws InterruptedException {
        Thread.sleep(3000);
        this.ceptel = ceptel;
        this.email = email;
    }

    public String getCeptel() {
        return ceptel;
    }

    public void setCeptel(String ceptel) {
        this.ceptel = ceptel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Iletisim{" +
                "ceptel='" + ceptel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    protected Iletisim clone() throws CloneNotSupportedException {
        return (Iletisim) super.clone();
    }
}
