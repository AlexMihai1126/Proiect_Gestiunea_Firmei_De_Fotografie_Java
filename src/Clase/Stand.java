package Clase;

public class Stand extends Echipament{
    private String brandStand;
    private Float inaltimeMaxima;
    private String tipStand;
    private String modelStand;

    public Stand(String brandStand, Float inaltimeMaxima, String tipStand, String modelStand) {
        this.brandStand = brandStand;
        this.inaltimeMaxima = inaltimeMaxima;
        this.tipStand = tipStand;
        this.modelStand = modelStand;
    }

    public String getBrandStand() {
        return brandStand;
    }

    public void setBrandStand(String brandStand) {
        this.brandStand = brandStand;
    }

    public Float getInaltimeMaxima() {
        return inaltimeMaxima;
    }

    public void setInaltimeMaxima(Float inaltimeMaxima) {
        this.inaltimeMaxima = inaltimeMaxima;
    }

    public String getTipStand() {
        return tipStand;
    }

    public void setTipStand(String tipStand) {
        this.tipStand = tipStand;
    }

    public String getModelStand() {
        return modelStand;
    }

    public void setModelStand(String modelStand) {
        this.modelStand = modelStand;
    }

    @Override
    public Float calculValoareDepreciata() {
        return null;
    }
}
