package domain;

import java.util.HashSet;
import java.util.Set;

public class Contact {

	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private Address address;
	private Set<PhoneNumber> phones = new HashSet<PhoneNumber>();
	private Set<ContactGroup> books = new HashSet<ContactGroup>();
	
	public Contact() {
		
	}

	public Contact(long id, String lastName, String firstName, String email, Set<PhoneNumber> phones, Address address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		if (phones != null)
			this.phones = phones;
		this.address = address;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String string) {
		email = string;
	}

	public long getId() {
		return id;
	}

	public void setId(long l) {
		id = l;
	}
	
	public Set<PhoneNumber> getPhones() {
		return phones;
	}

	public void setPhones(Set<PhoneNumber> phoneNumbers) {
		if (phoneNumbers != null)
			phones = phoneNumbers;
	}
	
	/* public void addPhoneNumber(PhoneNumber phone) {
		if (phone != null) {
			this.phones.add(phone);
			phone.setContact(this);
		}
	} */

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<ContactGroup> getBooks() {
		return books;
	}

	public void setBooks(Set<ContactGroup> books) {
		this.books = books;
	}

	/* public void addBook(ContactGroup group) {
		books.add(group);
		if (!group.hasContact(this))
			group.addContact(this);
	}

	public void removeBook(ContactGroup group) {
		books.remove(group);
		if (!group.hasContact(this))
			group.removeContact(this);
	} */
}
