package Modele;

public class PersFizica extends Persoana {
    private String prenume;
    private Integer cnp;

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getCnp() {
        return cnp;
    }

    public void setCnp(Integer cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "PersFizica{" +
                "prenume='" + prenume + '\'' +
                ", cnp=" + cnp +
                "} " + super.toString();
    }
}
