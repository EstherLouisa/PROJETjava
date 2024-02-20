package entities;

import java.util.ArrayList;

public class Client {
    private int id;
    private String nomComplet;
    private String tel;
    private String email;


    private ArrayList<Adresse> adresseList;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNomComplet() {
        return nomComplet;
    }


    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }


    public String getTel() {
        return tel;
    }


    public void setTel(String tel) {
        this.tel = tel;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public ArrayList<Adresse> getAdresseList() {
        return adresseList;
    }


    public void setAdresseList(ArrayList<Adresse> adresseList) {
        this.adresseList = adresseList;
    }
}
