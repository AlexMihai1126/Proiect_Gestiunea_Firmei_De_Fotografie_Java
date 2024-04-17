package Servicii;

import Modele.Eveniment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class EventManager {
    private static EventManager instance;
    private List<Eveniment> evenimente;

    private EventManager() {
        evenimente = new ArrayList<>();
    }

    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    public void adaugaEveniment(Eveniment eveniment) {
        evenimente.add(eveniment);
    }

    public void modificaEveniment(Eveniment evenimentVechi, Eveniment evenimentNou) {
        int index = evenimente.indexOf(evenimentVechi);
        if (index != -1) {
            evenimente.set(index, evenimentNou);
        } else {
            System.out.println("Evenimentul nu a fost gasit.");
        }
    }

    public void stergeEveniment(Eveniment eveniment) {
        evenimente.remove(eveniment);
    }

    public List<Eveniment> getEvenimenteAsList() {
        return new ArrayList<>(evenimente);
    }


    public Map<Integer, Eveniment> getEvenimenteAsMap() {
        Map<Integer, Eveniment> evenimenteMap = new HashMap<>();
        for (int i = 0; i < evenimente.size(); i++) {
            evenimenteMap.put(i, evenimente.get(i));
        }
        return evenimenteMap;
    }

    public Eveniment findEvenimentByIndex(Integer index) {
        if (index == null || index < 0 || index >= evenimente.size()) {
            return null; // Invalid index
        }
        return evenimente.get(index);
    }

    public List<Eveniment> getEvenimenteAzi() {
        List<Eveniment> rezultat = new ArrayList<>();
        LocalDate dataCurenta = LocalDate.now();

        for (Eveniment ev : evenimente) {
            if (ev.getDataStart().isEqual(dataCurenta)) {
                rezultat.add(ev);
            }
        }

        return rezultat;
    }
}
