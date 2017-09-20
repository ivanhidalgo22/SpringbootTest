/**
 * 
 */
package com.example.services;

import java.util.List;

import com.example.model.*;

/**
 * Defines operations for clients management.
 * @author ivan
 *
 */
public interface ClientManagementService {
	
	public Iterable<Client> getAllCLients();
	
	public void saveClient(Client client);
	
	public Client findClientByName(String name);
	
}
