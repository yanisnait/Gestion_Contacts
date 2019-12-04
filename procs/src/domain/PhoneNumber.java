package domain;


public class PhoneNumber {

	private long id;
	private String phoneKind;
	private String phoneNumber;
	private Contact contact;
	
	public PhoneNumber(long id, String phoneKind, String phoneNumber, Contact contact){
		this.id = id;
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
		this.contact = contact;
	}
  
	
	public long getId() {
		return id;
	}
	
	
	public String getPhoneKind() {
		return phoneKind;
	}

	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setId(int l) {
		id = l;
	}
	

	
	public void setPhoneKind(String string) {
		phoneKind = string;
	}
	
	public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        if (contact != null) {
            this.contact = contact;
        }
    }

	
	public void setPhoneNumber(String string) {
		phoneNumber = string;
	}
}