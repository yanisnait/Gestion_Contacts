package dao;

import domain.Contact;
import exception.DAOException;

public interface DAOContactInter {
	
	String addContact(final Contact contact) throws DAOException;
   // Object updateContact(final Contact contact) throws DAOException;
   Object deleteContact(final long id) throws DAOException;
}
