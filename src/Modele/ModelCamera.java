package Modele;

public enum ModelCamera {
    SonyA6700("Sony","ILCE-6700","Crop"),
    SonyA7S3("Sony","ILCE-7S3","FullFrame"),
    SonyA1("Sony","ILCE-1","FullFrame"),
    SonyA74("Sony","ILCE-7M4","FullFrame"),
    SonyA6600("Sony","ILCE-6600","Crop"),
    CanonR6("Canon","CanonEOSR6","FullFrame"),
    CanonR5("Canon","CanonEOSR5","FullFrame"),
    CanonR7("Canon","CanonEOSR7","Crop");
    private String brand;
    private String numeModel;
    private String tip;

    private ModelCamera(String brand, String numeModel, String tip){
        this.brand = brand;
        this.numeModel = numeModel;
        this.tip = tip;
    }
}
