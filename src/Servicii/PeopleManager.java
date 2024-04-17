package Servicii;

import java.util.ArrayList;
import java.util.List;
import Modele.Persoana;

public class PeopleManager {
    private static PeopleManager instance;
    private List<Persoana> persoane;

    private PeopleManager() {
        persoane = new ArrayList<>();
    }

    public static PeopleManager getInstance() {
        if (instance == null) {
            instance = new PeopleManager();
        }
        return instance;
    }

    public void adaugaPersoana(Persoana persoana) {
        persoane.add(persoana);
    }

    public void modificaPersoana(Persoana persoanaVeche, Persoana persoanaNoua) {
        int index = persoane.indexOf(persoanaVeche);
        if (index != -1) {
            persoane.set(index, persoanaNoua);
        } else {
            System.out.println("Persoana nu a fost gasita.");
        }
    }

    public void stergePersoana(Persoana persoana) {
        persoane.remove(persoana);
    }

    public List<Persoana> getAllPersoane() {
        return new ArrayList<>(persoane);
    }

    public List<Persoana> filterByType(Class<? extends Persoana> type) {
        List<Persoana> filteredList = new ArrayList<>();
        for (Persoana persoana : persoane) {
            if (type.isInstance(persoana)) {
                filteredList.add(persoana);
            }
        }
        return filteredList;
    }
}
