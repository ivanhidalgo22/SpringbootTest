package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Client;
import com.example.repositories.ClientDao;

@Service
public class ClientMgmtServiceImpl implements ClientManagementService {

	@Autowired
	private ClientDao clientDao;
	
	@Override
	public Iterable<Client> getAllCLients() {
		
		Client client = new Client();
		client.setIdentifier(10308549);
		client.setName("Ivan");
		client.setLastName("Hidalgo");
		
		List<Client> clients = new ArrayList<Client>();
		clients.add(client);
		return clientDao.findAll();
		
		
		
	}

	@Override
	public void saveClient(Client client) {
		clientDao.save(client);
	}

	@Override
	public Client findClientByName(String name) {
		return clientDao.findByName(name);
	}

}
