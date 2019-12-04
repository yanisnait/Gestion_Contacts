package domain;

import java.util.HashSet;
import java.util.Set;

public class ContactGroup {

	private long groupId;
	private String groupName;
	private Set<Contact> contacts = new HashSet<>();
	
	public ContactGroup(long groupId, String groupName, Set<Contact> contacts) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.contacts = contacts;
    }
	
	public Set<Contact> getContacts() {
    	return this.contacts;
    }

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	

	public long getGroupId() {
		return groupId;
	}

	
	public String getGroupName() {
		return groupName;
	}

	
	public void setGroupId(long l) {
		groupId = l;
	}

	
	public void setGroupName(String string) {
		groupName = string;
	}

	@Override
	public String toString() {
		return "ContactGroup [groupId=" + groupId + ", groupName=" + groupName + "]";
	}
}
