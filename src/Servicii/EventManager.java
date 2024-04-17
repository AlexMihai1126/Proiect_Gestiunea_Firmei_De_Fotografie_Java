package Servicii;

import Modele.Eveniment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    public List<Eveniment> getEvenimenteAzi(List<Eveniment> evenimente) {
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
