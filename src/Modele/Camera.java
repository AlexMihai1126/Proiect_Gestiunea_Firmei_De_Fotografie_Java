package Modele;

import java.util.List;

public class Camera extends Echipament{
    private ModelCamera modelCamera;
    private Integer numarEvenimente;
    private List<Obiectiv> obiectiveUtilizate;

    public ModelCamera getModelCamera() {
        return modelCamera;
    }

    public void setModelCamera(ModelCamera modelCamera) {
        this.modelCamera = modelCamera;
    }

    public Integer getNumarEvenimente() {
        return numarEvenimente;
    }

    public void setNumarEvenimente(Integer numarEvenimente) {
        this.numarEvenimente = numarEvenimente;
    }

    public List<Obiectiv> getObiectiveUtilizate() {
        return obiectiveUtilizate;
    }

    public void setObiectiveUtilizate(List<Obiectiv> obiectiveUtilizate) {
        this.obiectiveUtilizate = obiectiveUtilizate;
    }

    @Override
    public Float calculValoareDepreciata() {
        return null;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "modelCamera=" + modelCamera +
                ", numarEvenimente=" + numarEvenimente +
                ", obiectiveUtilizate=" + obiectiveUtilizate +
                "} " + super.toString();
    }
}
