package Servicii;

import Modele.Camera;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CameraManager {
    private static CameraManager instance;
    private List<Camera> camere;

    private CameraManager() {
        camere = new ArrayList<>();
    }

    public static CameraManager getInstance() {
        if (instance == null) {
            instance = new CameraManager();
        }
        return instance;
    }

    public void adaugaCamera(Camera camera) {
        camere.add(camera);
    }

    public void modificaCamera(Camera cameraVeche, Camera cameraNoua) {
        int index = camere.indexOf(cameraVeche);
        if (index != -1) {
            camere.set(index, cameraNoua);
        } else {
            System.out.println("Camera nu a fost gasita.");
        }
    }

    public void stergeCamera(Camera camera) {
        camere.remove(camera);
    }

    public List<Camera> getCamere() {
        if(camere.isEmpty()) {
            System.out.println("Nu exista cammere.");
            return Collections.emptyList();
        }
        return new ArrayList<>(camere);
    }
}
