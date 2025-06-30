package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import contactservice.Contact;
import contactservice.ContactService;

class ContactServiceTest {

	@Test
	void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        assertEquals(1, service.getAllContacts().size());
        assertEquals("John", service.getAllContacts().get(0).getFirstName());
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        service.deleteContact("123");
        assertEquals(0, service.getAllContacts().size());
    }

    @Test
    void testUpdateFirstName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        service.updateFirstName("123", "Jane");
        assertEquals("Jane", service.getAllContacts().get(0).getFirstName());
    }

    @Test
    void testUpdateLastName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        service.updateLastName("123", "Smith");
        assertEquals("Smith", service.getAllContacts().get(0).getLastName());
    }

    @Test
    void testUpdatePhone() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        service.updatePhone("123", "0987654321");
        assertEquals("0987654321", service.getAllContacts().get(0).getPhone());
    }

    @Test
    void testUpdateAddress() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        service.updateAddress("123", "456 Avenue");
        assertEquals("456 Avenue", service.getAllContacts().get(0).getAddress());
    }

}
