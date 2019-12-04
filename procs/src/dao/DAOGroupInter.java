package dao;

import domain.ContactGroup;
import exception.DAOException;

public interface DAOGroupInter {
	
	void addGroup(ContactGroup group) throws DAOException;
    //void updateGroup(ContactGroup group) throws DAOException;
    //void deleteGroup(long id) throws DAOException;


}
