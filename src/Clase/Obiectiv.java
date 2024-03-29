package Clase;

import java.util.List;
import java.util.Set;

public class Obiectiv extends Echipament{
    private String brandObiectiv;
    private String modelObiectiv;
    private String brandCameraCompatibila;
    private String tipCameraCompatibila;
    private String zoomObiectiv;
    private Float diafragmaMaxima;
    private List<Filtru> filtreAtasate;

    public Obiectiv(String brandObiectiv, String modelObiectiv, String brandCameraCompatibila, String tipCameraCompatibila, String zoomObiectiv, Float diafragmaMaxima) {
        this.brandObiectiv = brandObiectiv;
        this.modelObiectiv = modelObiectiv;
        this.brandCameraCompatibila = brandCameraCompatibila;
        this.tipCameraCompatibila = tipCameraCompatibila;
        this.zoomObiectiv = zoomObiectiv;
        this.diafragmaMaxima = diafragmaMaxima;
    }

    public String getBrandObiectiv() {
        return brandObiectiv;
    }

    public void setBrandObiectiv(String brandObiectiv) {
        this.brandObiectiv = brandObiectiv;
    }

    public String getModelObiectiv() {
        return modelObiectiv;
    }

    public void setModelObiectiv(String modelObiectiv) {
        this.modelObiectiv = modelObiectiv;
    }

    public String getBrandCameraCompatibila() {
        return brandCameraCompatibila;
    }

    public void setBrandCameraCompatibila(String brandCameraCompatibila) {
        this.brandCameraCompatibila = brandCameraCompatibila;
    }

    public String getTipCameraCompatibila() {
        return tipCameraCompatibila;
    }

    public void setTipCameraCompatibila(String tipCameraCompatibila) {
        this.tipCameraCompatibila = tipCameraCompatibila;
    }

    public String getZoomObiectiv() {
        return zoomObiectiv;
    }

    public void setZoomObiectiv(String zoomObiectiv) {
        this.zoomObiectiv = zoomObiectiv;
    }

    public Float getDiafragmaMaxima() {
        return diafragmaMaxima;
    }

    public void setDiafragmaMaxima(Float diafragmaMaxima) {
        this.diafragmaMaxima = diafragmaMaxima;
    }

    public List<Filtru> getFiltreAtasate() {
        return filtreAtasate;
    }

    public void setFiltreAtasate(List<Filtru> filtreAtasate) {
        this.filtreAtasate = filtreAtasate;
    }

    @Override
    public Float calculValoareDepreciata() {
        return null;
    }
}
