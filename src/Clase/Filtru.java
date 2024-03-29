package Clase;

import Enums.TipFiltru;

public class Filtru extends Echipament{
    private String brandFiltru;
    private TipFiltru tipFiltru;

    public Filtru(String brandFiltru, TipFiltru tipFiltru) {
        this.brandFiltru = brandFiltru;
        this.tipFiltru = tipFiltru;
    }

    public String getBrandFiltru() {
        return brandFiltru;
    }

    public void setBrandFiltru(String brandFiltru) {
        this.brandFiltru = brandFiltru;
    }

    public TipFiltru getTipFiltru() {
        return tipFiltru;
    }

    public void setTipFiltru(TipFiltru tipFiltru) {
        this.tipFiltru = tipFiltru;
    }

    @Override
    public Float calculValoareDepreciata() {
        return null;
    }
}
