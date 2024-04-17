package Builders;

import Modele.Camera;
import Modele.ModelCamera;
import Modele.Obiectiv;

import java.time.LocalDate;

public class EchipamentBuilder {
    private Float pretAchizitie;
    private LocalDate dataAchizitiei;
    private ModelCamera modelCamera;
    private Integer numarEvenimente;
    private String brandObiectiv;
    private String modelObiectiv;
    private String brandCameraCompatibila;
    private String tipCameraCompatibila;

    public EchipamentBuilder pretAchizitie(Float pretAchizitie) {
        this.pretAchizitie = pretAchizitie;
        return this;
    }

    public EchipamentBuilder dataAchizitiei(LocalDate dataAchizitiei) {
        this.dataAchizitiei = dataAchizitiei;
        return this;
    }

    public EchipamentBuilder modelCamera(ModelCamera modelCamera) {
        this.modelCamera = modelCamera;
        return this;
    }

    public EchipamentBuilder numarEvenimente(Integer numarEvenimente) {

        this.numarEvenimente = numarEvenimente;
        return this;
    }

    public EchipamentBuilder brandObiectiv(String brandObiectiv) {
        this.brandObiectiv = brandObiectiv;
        return this;
    }

    public EchipamentBuilder modelObiectiv(String modelObiectiv) {
        this.modelObiectiv = modelObiectiv;
        return this;
    }

    public EchipamentBuilder brandCameraCompatibila(String brandCameraCompatibila) {
        this.brandCameraCompatibila = brandCameraCompatibila;
        return this;
    }

    public EchipamentBuilder tipCameraCompatibila(String tipCameraCompatibila) {
        this.tipCameraCompatibila = tipCameraCompatibila;
        return this;
    }

    public Camera buildCamera() {
        Camera camera = new Camera();
        camera.setPretAchizitie(pretAchizitie);
        camera.setDataAchizitiei(dataAchizitiei);
        camera.setModelCamera(modelCamera);
        camera.setNumarEvenimente(numarEvenimente);
        return camera;
    }

    public Obiectiv buildObiectiv() {
        Obiectiv obiectiv = new Obiectiv();
        obiectiv.setPretAchizitie(pretAchizitie);
        obiectiv.setDataAchizitiei(dataAchizitiei);
        obiectiv.setBrandObiectiv(brandObiectiv);
        obiectiv.setModelObiectiv(modelObiectiv);
        obiectiv.setBrandCameraCompatibila(brandCameraCompatibila);
        obiectiv.setTipCameraCompatibila(tipCameraCompatibila);
        return obiectiv;
    }
}
