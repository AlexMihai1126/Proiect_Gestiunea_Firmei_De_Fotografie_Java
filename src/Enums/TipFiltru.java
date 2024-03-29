package Enums;

public enum TipFiltru {
    ND2("NeutralDensity",2),
    ND4("NeutralDensity",4),
    ND8("NeutralDensity",8),
    ND16("NeutralDensity",16),
    ND32("NeutralDensity",32),
    ND64("NeutralDensity",64),
    CPL("PolarizareCirculara",4),
    CineBloom("Difuzie",0);
    private String tipFiltru;
    private Integer gradReductieLumina;

    private TipFiltru(String tipFiltru, Integer gradReductieLumina) {
        this.tipFiltru = tipFiltru;
        this.gradReductieLumina = gradReductieLumina;
    }
}
