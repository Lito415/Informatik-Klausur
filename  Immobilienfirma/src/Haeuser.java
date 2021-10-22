public class Haeuser {
    int _preis;
    int _stockwerke;
    int _quadratmeter;
    String _beschreibung;
    String _titel;

    public Haeuser (int preis, int stockwerke, int quadratmeter, String beschreibung, String titel) {
        this.setPreis(preis);
        this.setStockwerke(stockwerke);
        this.setQuadratmeter(quadratmeter);
        this.setBeschreibung(beschreibung);
        this.setTitel(titel);
    }

    public String getBeschreibung() {
        return _beschreibung;
    }
    public int getPreis() {
        return _preis;
    }
    public int getStockwerke() {
        return _stockwerke;
    }
    public int getQuadratmeter() {
        return _quadratmeter;
    }
    public String getTitel() {
        return _titel;
    }
    public void setPreis(int preis) {
        _preis = preis;
    }
    public void setStockwerke(int stockwerk) {
        _stockwerke = stockwerk;
    }
    public void setQuadratmeter(int quadratmeter) {
        _quadratmeter = quadratmeter;
    }
    public void setBeschreibung(String beschreibung) {
        _beschreibung = beschreibung;
    }
    public void setTitel(String titel) {
        _titel = titel;
    }
    
}
