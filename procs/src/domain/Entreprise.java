package domain;

import java.util.Set;

public class Entreprise extends Contact {

	private long numSiret = 0;
	
	public Entreprise (Contact contact, long numSiret) {
		setId(contact.getId());
        setFirstName("Entreprise");
        setEmail(contact.getEmail());
        setAddress(contact.getAddress());
        setPhones(contact.getPhones());
        this.numSiret = numSiret;
	}
	
	public Entreprise(long id, String lastName, String firstName ,String email, 
			Set<PhoneNumber> phones, Address address, long numSiret) {
        super(id,lastName, firstName ,email, phones, address);
        this.numSiret = numSiret;
    }

	
	public long getNumSiret() {
		return numSiret;
	}

	public void setId(long l) {
		numSiret = l;
	}
}