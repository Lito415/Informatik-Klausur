public class Verkauf {
    Wohnungen _wohnungen;
    Haeuser _haeuser;
    Makler _makler;
    Kaeufer _kaeufer;
    int _preis;

    public Verkauf (Wohnungen wohnungen, Haeuser haeuser, Makler makler, Kaeufer kaeufer, int preis){
        this.setWohnungen(wohnungen);
        this.setHaeuser(haeuser);
        this.setMakler(makler);
        this.setKaeufer(kaeufer);
        this.setPreis(preis);

    }
    public Wohnungen getWohnungen() {
        return _wohnungen;
    }
    public Haeuser getHaeuser() {
        return _haeuser;
    }
    public Makler getMakler() {
        return _makler;
    }
    public Kaeufer getKaeufer() {
        return _kaeufer;
    }
    public int getPreis() {
        return _preis;
    }

    public void setWohnungen(Wohnungen wohnungen) {
        _wohnungen = wohnungen;
    }
    public void setHaeuser(Haeuser haus) {
        _haeuser = haus;
    }
    public void setMakler(Makler makler) {
        _makler = makler;
    }
    public void setKaeufer(Kaeufer kaeufer) {
        _kaeufer = kaeufer;
    }
    public void setPreis(int preis) {
        _preis = preis;
    }
    

    

   
    
}
