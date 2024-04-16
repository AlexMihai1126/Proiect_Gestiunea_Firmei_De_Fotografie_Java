package Builders;
import Modele.Echipament;
import Modele.Eveniment;
import Modele.Fotograf;
import Modele.Persoana;

import java.time.LocalDate;
import java.util.List;
public class EvenimentBuilder {
    private List<Fotograf> fotografList;
    private List<Echipament> echipamenteList;
    private Persoana clientEveniment;
    private LocalDate dataStart;
    private LocalDate dataSfarsit;

    public EvenimentBuilder fotografList(List<Fotograf> fotografList) {
        this.fotografList = fotografList;
        return this;
    }

    public EvenimentBuilder echipamenteList(List<Echipament> echipamenteList) {
        this.echipamenteList = echipamenteList;
        return this;
    }

    public EvenimentBuilder clientEveniment(Persoana clientEveniment) {
        this.clientEveniment = clientEveniment;
        return this;
    }

    public EvenimentBuilder dataStart(LocalDate dataStart) {
        this.dataStart = dataStart;
        return this;
    }

    public EvenimentBuilder dataSfarsit(LocalDate dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
        return this;
    }

    public Eveniment build() {
        return new Eveniment(fotografList, echipamenteList, clientEveniment, dataStart, dataSfarsit);
    }
}

