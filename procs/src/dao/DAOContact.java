package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import domain.Contact;
import exception.DAOException;
import util.HibernateUtil;

public class DAOContact implements DAOContactInter{
	
	
	@Override
	public String addContact(Contact contact) throws DAOException {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.persist(contact);
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			throw new DAOException(
					String.format("Failed to create contact or company %s: ", contact.getFirstName()), "exception.add.contact.failed");
		}
		return null;
	}
	
	public Object deleteContact(final long id) throws DAOException {
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Contact contact = (Contact) session.get(Contact.class, id);
			session.delete(contact);
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			throw new DAOException(
					String.format("Failed to delete contact or company %d : ", id), "exception.delete.contact.failed");
		}
		return null;
	}
		
	
//	@Override
//	public Object updateContact(final Contact contact) throws DAOException {
//		try {
//			Address address = contact.getAddress();
//			if (!address.isValid()) {
//				contact.setAddress(null);
//			}
//			System.out.println("updateContact");
//
//			Session session = getSessionFactory().openSession();
//			session.beginTransaction();
//			session.merge(contact);
//			session.getTransaction().commit();
//			session.close();
//
//			if (!address.isValid() && address.getId() != 0) {
//				deleteAddress(address.getId());
//			}
//		} catch (StaleObjectStateException e) {
//			e.printStackTrace();
//			throw new DAOException(
//					String.format("Failed to update contact or company %s: ", contact.getFullName()), "exception.edit.contact.lock.failed");
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			throw new DAOException(
//					String.format("Failed to update contact or company %s: ", contact.getFullName()), "exception.connexion.database.failed");
//		}
//		return null;
//	}
	
	
}
