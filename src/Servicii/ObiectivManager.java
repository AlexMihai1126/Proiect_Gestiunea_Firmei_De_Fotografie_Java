package Servicii;

import Modele.Obiectiv;
import java.util.ArrayList;
import java.util.List;

public class ObiectivManager {
    private static ObiectivManager instance;
    private List<Obiectiv> obiective;

    private ObiectivManager() {
        obiective = new ArrayList<>();
    }

    public static ObiectivManager getInstance() {
        if (instance == null) {
            instance = new ObiectivManager();
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
        return new ArrayList<>(obiective);
    }
}
