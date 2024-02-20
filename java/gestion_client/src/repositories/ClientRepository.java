package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Client;

public class ClientRepository {
    private List<Client> clients = new ArrayList<>();

    public void insert(Client client) {
        clients.add(client);
    }

    public List<Client> selectAll() {
        return new ArrayList<>(clients);
    }


    public Client selectById(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client; 
            }
        }
        return null; 
    }
}
