package Servicii;

import Modele.Obiectiv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObiectiveManager {
    private static ObiectiveManager instance;
    private List<Obiectiv> obiective;

    private ObiectiveManager() {
        obiective = new ArrayList<>();
    }

    public static ObiectiveManager getInstance() {
        if (instance == null) {
            instance = new ObiectiveManager();
        }
        return instance;
    }

    public void adaugaObiectiv(Obiectiv obiectiv) {
        obiective.add(obiectiv);
    }

    public void modificaObiectiv(Obiectiv obiectivVechi, Obiectiv obiectivNou) {
        int index = obiective.indexOf(obiectivVechi);
        if (index != -1) {
            obiective.set(index, obiectivNou);
        } else {
            System.out.println("Obiectivul nu a fost gasit.");
        }
    }

    public void stergeObiectiv(Obiectiv obiectiv) {
        obiective.remove(obiectiv);
    }

    public List<Obiectiv> getObiective() {
        if(obiective.isEmpty()) {
            System.out.println("Nu exista obiective.");
            return Collections.emptyList();
        }
        return new ArrayList<>(obiective);
    }
}
