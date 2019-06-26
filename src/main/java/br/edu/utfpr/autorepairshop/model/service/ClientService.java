package br.edu.utfpr.autorepairshop.model.service;

import br.edu.utfpr.autorepairshop.model.Client;
import br.edu.utfpr.autorepairshop.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return this.clientRepository.findAll();
    }

    public Client save(Client entity){
        return this.clientRepository.save(entity);
    }
}
