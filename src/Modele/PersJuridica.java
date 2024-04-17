package Modele;

public class PersJuridica extends Persoana {
    private Integer cui;

    public Integer getCui() {
        return cui;
    }

    public void setCui(Integer cui) {
        this.cui = cui;
    }

    @Override
    public String toString() {
        return "PersJuridica{" +
                "cui=" + cui +
                "} " + super.toString();
    }
}
