package Builders;

import java.time.LocalDate;
import Modele.PersFizica;
import Modele.PersJuridica;
import Modele.Fotograf;

public class PersoanaBuilder {
    private String nume;
    private String prenume;
    private String email;
    private String telefon;
    private Integer cnp;
    private Integer cui;
    private String specializare;
    private LocalDate dataAngajarii;

    public PersoanaBuilder nume(String nume) {
        this.nume = nume;
        return this;
    }

    public PersoanaBuilder prenume(String prenume) {
        this.prenume = prenume;
        return this;
    }

    public PersoanaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersoanaBuilder telefon(String telefon) {
        this.telefon = telefon;
        return this;
    }

    public PersoanaBuilder cnp(Integer cnp) {
        this.cnp = cnp;
        return this;
    }

    public PersoanaBuilder cui(Integer cui) {
        this.cui = cui;
        return this;
    }

    public PersoanaBuilder specializare(String specializare) {
        this.specializare = specializare;
        return this;
    }

    public PersoanaBuilder dataAngajarii(LocalDate dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
        return this;
    }

    public PersFizica buildPersFizica() {
        PersFizica persoana = new PersFizica();
        persoana.setNume(nume);
        persoana.setPrenume(prenume);
        persoana.setEmail(email);
        persoana.setTelefon(telefon);
        persoana.setCnp(cnp);
        return persoana;
    }

    public PersJuridica buildPersJuridica() {
        PersJuridica persoana = new PersJuridica();
        persoana.setNume(nume);
        persoana.setEmail(email);
        persoana.setTelefon(telefon);
        persoana.setCui(cui);
        return persoana;
    }

    public Fotograf buildFotograf() {
        Fotograf fotograf = new Fotograf();
        fotograf.setNume(nume);
        fotograf.setPrenume(prenume);
        fotograf.setEmail(email);
        fotograf.setTelefon(telefon);
        fotograf.setCnp(cnp);
        fotograf.setSpecializare(specializare);
        fotograf.setDataAngajarii(dataAngajarii);
        return fotograf;
    }
}
