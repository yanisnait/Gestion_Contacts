package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import domain.Contact;
import domain.ContactGroup;
import exception.DAOException;
import util.HibernateUtil;

public class DAOGroup implements DAOGroupInter {
	
	@Override
    public void addGroup(ContactGroup group) throws DAOException {
        // getHibernateTemplate().save(group);
		Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(group);
            session.getTransaction().commit();
            session.close();
        } catch(HibernateException e) {
            System.err.println(e.getMessage());
            throw new DAOException(
                    String.format("Failed to save contact %s", group.getGroupName()), "exception.add.group.failed");
        }
    }

}
