package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Adresse;
import entities.Client;
public class AdresseRepository {

    private ArrayList<Adresse> tableAdresses=new ArrayList<>();

    public void insert(Adresse adresse){
        tableAdresses.add(adresse);
     }
    public List<Adresse> selectAll(){
        return tableAdresses;
     }
     public List<Adresse> selectByClient(String nomComplet){
        List<Adresse> AdressesUnClient=new ArrayList<>();
        for (Adresse adresse: tableAdresses) {
            if(adresse.getClient().getNomComplet ().compareTo(nomComplet)==0) {
                AdressesUnClient.add(adresse);
            }  
        }
        return AdressesUnClient;
     }

     
}
