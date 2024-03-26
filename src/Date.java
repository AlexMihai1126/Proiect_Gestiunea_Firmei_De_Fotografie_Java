public class Date {
    private Integer zi;
    private Integer luna;
    private Integer an;
    private Integer ora;
    private  Integer minut;

    public Date(Integer zi, Integer luna, Integer an, Integer ora, Integer minut) {
        this.zi = zi;
        this.luna = luna;
        this.an = an;
        this.ora = ora;
        this.minut = minut;
    }

    public Integer getZi() {
        return zi;
    }

    public void setZi(Integer zi) {
        this.zi = zi;
    }

    public Integer getLuna() {
        return luna;
    }

    public void setLuna(Integer luna) {
        this.luna = luna;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public Integer getOra() {
        return ora;
    }

    public void setOra(Integer ora) {
        this.ora = ora;
    }

    public Integer getMinut() {
        return minut;
    }

    public void setMinut(Integer minut) {
        this.minut = minut;
    }

    public String convertMonth(Integer month){
        return switch (month) {
            case 1 -> "Ianuarie";
            case 2 -> "Februarie";
            case 3 -> "Martie";
            case 4 -> "Aprilie";
            case 5 -> "Mai";
            case 6 -> "Iunie";
            case 7 -> "Iulie";
            case 8 -> "August";
            case 9 -> "Septembrie";
            case 10 -> "Octombrie";
            case 11 -> "Noiembrie";
            case 12 -> "Decembrie";
            default -> throw new IllegalStateException("Out of range: " + month);
        };
    }

    @Override
    public String toString() {
        return "Data eveniment: " + this.zi + " "+ convertMonth(this.luna) + " " + this.an + " " + "Ora: " + this.ora + ":" + this.minut;
    }
}
