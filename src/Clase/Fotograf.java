package Clase;

import java.time.LocalDate;
public class Fotograf {
    private String nume;
    private String prenume;
    private String cnp;
    private String email;
    private String telefon;
    private String specializare;
    private LocalDate dataAngajarii;

    public Fotograf(String nume, String prenume, String cnp, String email, String telefon, String specializare, LocalDate dataAngajarii) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.email = email;
        this.telefon = telefon;
        this.specializare = specializare;
        this.dataAngajarii=dataAngajarii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

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

    @Override
    public String toString() {
        return "Clase.Fotograf{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp='" + cnp + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", specializare='" + specializare + '\'' +
                ", dataAngajarii=" + dataAngajarii +
                '}';
    }
}
