package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Client;
import com.example.services.ClientManagementService;
import com.example.services.ClientMgmtServiceImpl;

@RestController
@RequestMapping("/api/v1/")
public class ClientController {
	
	@Autowired
	private ClientManagementService clientService;
	
	
    @RequestMapping(value = "clients", method = RequestMethod.GET)
    public Iterable<Client> getClients() {
       
    	//ClientManagementService clientService = new ClientMgmtServiceImpl();
    	return clientService.getAllCLients();
    	
    }

    /**
     * /create  --> Create a new user and save it in the database.
     * 
     * @param email User's email
     * @param name User's name
     * @return A string describing if the user is succesfully created or not.
     */
    @RequestMapping(value = "clients", method = RequestMethod.POST)
    public String create(@RequestBody Client client) {
      
      try {
    	  clientService.saveClient(client);
      }
      catch (Exception ex) {
        return "Error creating the user: " + ex.toString();
      }
      return "Client succesfully created!)";
    }
    
    @RequestMapping(value = "clients/{name}", method = RequestMethod.GET)
    public Client getClientByName(@PathVariable String name) {
       
    	//ClientManagementService clientService = new ClientMgmtServiceImpl();
    	return clientService.findClientByName(name);
    	
    }

	
	
}
