import java.time.LocalDate;

public class Projekt {
    private String nazev;
    private Integer pocetResitelu;
    private Boolean dokonceno;
    private LocalDate datumZahajeni;
    private Integer hodnoceni;

    public Projekt(String nazev, Integer pocetResitelu,Boolean dokonceno, LocalDate datumZahajeni, Integer hodnoceni) {
        this.nazev = nazev;
        this.pocetResitelu = pocetResitelu;
        this.datumZahajeni = datumZahajeni;
        this.hodnoceni = hodnoceni;
        this.dokonceno = dokonceno;
    }

    public String getNazev() {
        return nazev;
    }

    public Boolean getDokonceno() {
        return dokonceno;
    }

    public Integer getPocetResitelu() {
        return pocetResitelu;
    }

    public LocalDate getDatumZahajeni() {
        return datumZahajeni;
    }

    public Integer getHodnoceni() {
        return hodnoceni;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setDokonceno(Boolean dokonceno) {
        this.dokonceno = dokonceno;
    }

    public void setPocetResitelu(Integer pocetResitelu) {
        this.pocetResitelu = pocetResitelu;
    }

    public void setDatumZahajeni(LocalDate datumZahajeni) {
        this.datumZahajeni = datumZahajeni;
    }

    public void setHodnoceni(Integer hodnoceni) {
        this.hodnoceni = hodnoceni;
    }
}
