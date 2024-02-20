package services;

import java.util.List;

import entities.Adresse;
import repositories.AdresseRepository;

public class AdresseService {
    private AdresseRepository adresseRepository =new AdresseRepository();
    public  List<Adresse> listerAdresse(){
           return adresseRepository.selectAll();
    }
    public  List<Adresse> listerAdresseUnClient(String nomComplet){
        return adresseRepository.selectByClient(nomComplet);
   }
}
