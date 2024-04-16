package Modele;

import java.time.LocalDate;
public class Fotograf extends PersFizica {
    private String specializare;
    private LocalDate dataAngajarii;

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public LocalDate getDataAngajarii() {
        return dataAngajarii;
    }

    public void setDataAngajarii(LocalDate dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
    }
}
