package com.example.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Client;

/**
 * A DAO for the entity User is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 * 
 * @author netgloo
 */
@Transactional
public interface ClientDao extends CrudRepository<Client, Long> {

	/**
	   * Return the client having the passed name or null if no client is found.
	   * 
	   * @param email the user email.
	   */
	  public Client findByName(String name);

	
}
