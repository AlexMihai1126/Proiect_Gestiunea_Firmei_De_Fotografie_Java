package Enums;

public enum TipLumina {
    ContinuaRGBLightbar("Lightbar","LedRGB"),
    ContinuaRGBPanou("Panou","LedRGB"),
    ContinuaPanou("Panou","LED"),
    Blit("Flash","Xenon"),
    ContinuaSpot("Softbox","LED");
    private String tip;
    private String sursaLumina;

    private TipLumina(String tip, String sursaLumina) {
        this.tip = tip;
        this.sursaLumina = sursaLumina;
    }
}
