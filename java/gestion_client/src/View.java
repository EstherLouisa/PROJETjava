import entities.Client;

import java.util.Scanner;
import java.util.List;
import entities.Adresse;
import repositories.AdresseRepository;
import repositories.ClientRepository;
import services.AdresseService;
import services.ClientService;


public class View {
    public static void main(String[] args) throws Exception {
        AdresseService adresseService=new AdresseService();
        ClientService clientService = new ClientService();

        Scanner scanner=new Scanner(System.in);
           int choix;
           do{
              System.out.println("1-Créer un client");
              System.out.println("2-Lister les clients");
              System.out.println("3-Ajouter une adresse et lui associer un client");
              System.out.println("4-Lister les  adresses d'un client")
              System.out.println("5-Quitter");
              
              choix=scanner.nextInt();
              scanner.nextLine();
                            case 1:
                                System.out.println("======================Création d'un nouveau client=================");
                                Client newClient = new Client(); 
                                System.out.println("Entrer l'id du client: ");
                                newClient.setId(scanner.nextInt());
                                scanner.nextLine();
                                System.out.println("Entrer le nom complet du client: ");
                                newClient.setNomComplet(scanner.nextLine());
                                System.out.print("Entrer le numéro de téléphone du client: ");
                                newClient.setTel(scanner.nextLine());
                                System.out.print("Entrer l'email du client: ");
                                newClient.setEmail(scanner.nextLine());
                            

                                clientService.addClient(newClient);
                                System.out.println("Client ajouté avec succès.");
                                        break;
                            

                            case 2:
                                System.out.println("====================Liste de tous les clients=================:");
                                    List<Client> clients = clientService.listAllClients();
                                    if (clients.isEmpty()) {
                                    System.out.println("Aucun client n'a été ajouté pour le moment.");
                                    } 
                                    else {
                                    for (Client client : clients) {
                                    System.out.println("id: " + client.getId() +", Nom: " + client.getNomComplet() + ", Tel: " + client.getTel() + ", Email: " + client.getEmail());
                                    
                                    System.out.println("=====================================================");
                                }
                            }
                                
                                break;
                        
                                default:
                                System.out.println("Choix non valide, veuillez réessayer.");
                        break; 
                            case 3:
                            Adresse adresse=new Adresse();
                            System.out.println("Entrer le quartier");
                        adresse.setQuartier(scanner.nextLine());
                        System.out.println("Entrer le numéro de la villa");
                        adresse.setNumVilla(scanner.nextInt());
                        adresseService.addAdresse(adresse);
                    break;
                    case 4:
                    System.out.println("Entrer le nom ");
                                    String tel= scanner.nextLine();
                                    adressesList=adresseService.listerAdresseUnClient(nomComplet);
                                    for (adresse ad: adressesList) {
                                        System.out.println("NomComplet: "+ ad.getNomComplet());
                                        System.out.println("===============");
                                    }
                                break;
                    
            }while(choix!=5);
           scanner.close();
}
}
    


    


