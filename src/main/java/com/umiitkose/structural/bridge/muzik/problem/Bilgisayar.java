package com.umiitkose.structural.bridge.muzik.problem;

public class Bilgisayar {

    private Spotify spotify;
    private Hoparlor hoparlor;

    public Bilgisayar(){
        spotify = new Spotify();
        hoparlor = new Hoparlor();
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Hoparlor getHoparlor() {
        return hoparlor;
    }

    public void setHoparlor(Hoparlor hoparlor) {
        this.hoparlor = hoparlor;
    }

    public void muzikCal(Muzik muzik){
        String ses = spotify.muzikCal(muzik);
        hoparlor.sesiCal(ses);
    }
}
