package service;

import dao.DAOContact;
import domain.*;
import exception.DAOException;

public class ContactService {
	
	private DAOContact DAOcontact;
	

	public String addContact(Contact contact) throws DAOException {
		return DAOcontact.addContact(contact);
	}

	public Object deleteContact(Long contactId) throws DAOException {
		return DAOcontact.deleteContact(contactId);
	}

}
