package Clase;

import java.util.List;
import java.time.LocalDate;
public class Eveniment {
    private List<Fotograf> fotografList;
    private List<Echipament> echipamenteList;
    private Persoana clientEveniment;
    private LocalDate dataStart;
    private LocalDate dataSfarsit;

    public Eveniment(List<Fotograf> fotografList, List<Echipament> echipamenteList, Persoana clientEveniment, LocalDate dataStart, LocalDate dataSfarsit) {
        this.fotografList = fotografList;
        this.echipamenteList = echipamenteList;
        this.clientEveniment = clientEveniment;
        this.dataStart = dataStart;
        this.dataSfarsit = dataSfarsit;
    }

    public List<Fotograf> getFotografList() {
        return fotografList;
    }

    public void setFotografList(List<Fotograf> fotografList) {
        this.fotografList = fotografList;
    }

    public List<Echipament> getEchipamenteList() {
        return echipamenteList;
    }

    public void setEchipamenteList(List<Echipament> echipamenteList) {
        this.echipamenteList = echipamenteList;
    }

    public Persoana getClientEveniment() {
        return clientEveniment;
    }

    public void setClientEveniment(Persoana clientEveniment) {
        this.clientEveniment = clientEveniment;
    }

    public LocalDate getDataStart() {
        return dataStart;
    }

    public void setDataStart(LocalDate dataStart) {
        this.dataStart = dataStart;
    }

    public LocalDate getDataSfarsit() {
        return dataSfarsit;
    }

    public void setDataSfarsit(LocalDate dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
    }
}
