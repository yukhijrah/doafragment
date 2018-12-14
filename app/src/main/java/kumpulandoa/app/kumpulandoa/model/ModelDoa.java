package kumpulandoa.app.kumpulandoa.model;

import java.io.Serializable;

public class ModelDoa implements Serializable {

    private String namaDoa;
    private String arabDoa;
    private String latinDoa;
    private String artiDoa;

    public ModelDoa(String namaDoa, String arabDoa, String latinDoa, String artiDoa){
        this.namaDoa = namaDoa;
        this.arabDoa = arabDoa;
        this.latinDoa = latinDoa;
        this.artiDoa = artiDoa;
    }

    public String getNamaDoa() {
        return namaDoa;
    }

    public String getArabDoa() {
        return arabDoa;
    }

    public String getLatinDoa() {
        return latinDoa;
    }

    public String getArtiDoa() {
        return artiDoa;
    }
}