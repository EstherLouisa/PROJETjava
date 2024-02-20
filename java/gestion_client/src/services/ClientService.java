package services;

import java.util.List;

import entities.Client;
import repositories.ClientRepository;

public class ClientService {
    private ClientRepository clientRepository = new ClientRepository();

    public void addClient(Client client) {
        clientRepository.insert(client);
    }

    
    public List<Client> listAllClients() {
        return clientRepository.selectAll();
    }

    
   public Client getClient(int id) {
        return clientRepository.selectById(id);
    }

}
