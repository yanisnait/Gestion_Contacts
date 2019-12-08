package servlet;

import java.util.Set;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;


import dao.DAOContact;
import domain.Address;
import domain.ContactGroup;
import domain.PhoneNumber;


public class AddContactAction extends Action {
	

	public ActionForward execute(final ActionMapping pMapping,ActionForm pForm, 
			final HttpServletRequest pRequest,final HttpServletResponse pResponse) 
	{
			final AddContactValidationForm
			lForm = (AddContactValidationForm)pForm;
			
			
			final String lastName = lForm.getLastName();
			final String firstName = lForm.getFirstName();
			final String email = lForm.getEmail();
			final Set<PhoneNumber> phones = lForm.getPhones();
			final String address =lForm.getAddress();
			
			
			
			final DAOContact lDAOContact = new DAOContact();
			final String lError = lDAOContact.addContact(Contact contact);
			System.out.println(lError);
			if(lError == null) 
			{// if no exception is raised, forward "success"
				return pMapping.findForward("success");
			}			
			else 
			{// If any exception, return the "error" forward
				return pMapping.findForward("error");
			}
	}
	

}
