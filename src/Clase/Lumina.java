package Clase;

import Enums.TipLumina;

public class Lumina extends Echipament{
    private String brandLumina;
    private Integer maxOutputLumens;
    private Integer maxWatts;
    private TipLumina tipLumina;

    public Lumina(String brandLumina, Integer maxOutputLumens, Integer maxWatts, TipLumina tipLumina) {
        this.brandLumina = brandLumina;
        this.maxOutputLumens = maxOutputLumens;
        this.maxWatts = maxWatts;
        this.tipLumina = tipLumina;
    }

    public String getBrandLumina() {
        return brandLumina;
    }

    public void setBrandLumina(String brandLumina) {
        this.brandLumina = brandLumina;
    }

    public Integer getMaxOutputLumens() {
        return maxOutputLumens;
    }

    public void setMaxOutputLumens(Integer maxOutputLumens) {
        this.maxOutputLumens = maxOutputLumens;
    }

    public Integer getMaxWatts() {
        return maxWatts;
    }

    public void setMaxWatts(Integer maxWatts) {
        this.maxWatts = maxWatts;
    }

    public TipLumina getTipLumina() {
        return tipLumina;
    }

    public void setTipLumina(TipLumina tipLumina) {
        this.tipLumina = tipLumina;
    }

    @Override
    public Float calculValoareDepreciata() {
        return null;
    }
}
