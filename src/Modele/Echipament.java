package Modele;

import java.time.LocalDate;
public abstract class Echipament {
    private Float pretAchizitie;
    private LocalDate dataAchizitiei;

    public Float getPretAchizitie() {
        return pretAchizitie;
    }

    public void setPretAchizitie(Float pretAchizitie) {
        this.pretAchizitie = pretAchizitie;
    }

    public LocalDate getDataAchizitiei() {
        return dataAchizitiei;
    }

    public void setDataAchizitiei(LocalDate dataAchizitiei) {
        this.dataAchizitiei = dataAchizitiei;
    }

    public abstract Float calculValoareDepreciata();

    @Override
    public String toString() {
        return "Echipament{" +
                "pretAchizitie=" + pretAchizitie +
                ", dataAchizitiei=" + dataAchizitiei +
                '}';
    }
}
