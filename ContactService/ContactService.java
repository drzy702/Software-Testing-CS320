package contactservice;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

	private List<Contact> contacts;

	public ContactService() {
		this.contacts = new ArrayList<>();
	}

	// Add a new contact
	public void addContact(Contact contact) {
		for (Contact c : contacts) {
			if (c.getContactId().equals(contact.getContactId())) {
				throw new IllegalArgumentException("Contact ID must be unique");
			}
		}
		contacts.add(contact);
	}

	// Delete a contact by ID
	public void deleteContact(String contactId) {
		boolean removed = contacts.removeIf(c -> c.getContactId().equals(contactId));
		if (!removed) {
			throw new IllegalArgumentException("Contact ID not found");
		}
	}

	//update FirstName by ID
	public void updateFirstName(String contactId, String newFirstName) {
		Contact contact = findContactById(contactId);
		contact.setFirstName(newFirstName);
	}

	//update lastName by ID
	public void updateLastName(String contactId, String newLastName) {
		Contact contact = findContactById(contactId);
		contact.setLastName(newLastName);
	}

	//update phone by ID
	public void updatePhone(String contactId, String newPhone) {
		Contact contact = findContactById(contactId);
		contact.setPhone(newPhone);
	}
	//update address by ID
	public void updateAddress(String contactId, String newAddress) {
		Contact contact = findContactById(contactId);
		contact.setAddress(newAddress);
		}

	// Helper method to find a contact by ID
	private Contact findContactById(String contactId) {
		for (Contact c : contacts) {
			if (c.getContactId().equals(contactId)) {
				return c;
			}
		}
		throw new IllegalArgumentException("Contact ID not found");
	}
	public List<Contact> getAllContacts() {
	    return contacts;
	}
}
