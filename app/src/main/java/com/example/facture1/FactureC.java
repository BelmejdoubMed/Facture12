package com.example.facture1;

public class FactureC {
    private String numFacture;
    private String date;
    private String Client;
    private String ICE;
    private String Produit;
    private float prix;
    private int Qte;


    public FactureC(String numFacture, String date, String client, String ICE, String produit, float prix, int qte) {
        this.numFacture = numFacture;
        this.date = date;
        Client = client;
        this.ICE = ICE;
        Produit = produit;
        this.prix = prix;
        Qte = qte;
    }

    public String getNumFacture() {
        return numFacture;
    }

    public void setNumFacture(String numFacture) {
        this.numFacture = numFacture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    public String getICE() {
        return ICE;
    }

    public void setICE(String ICE) {
        this.ICE = ICE;
    }

    public String getProduit() {
        return Produit;
    }

    public void setProduit(String produit) {
        Produit = produit;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getQte() {
        return Qte;
    }

    public void setQte(int qte) {
        Qte = qte;
    }
}
