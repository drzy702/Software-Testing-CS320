package contactservice;

// Class that represents a contact with ID, first name, last name, phone, and address
public class Contact {
	// Fields representing contact attributes
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	// Constructor to create a new contact with validation for all fields
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		// Validate contactId: must not be null and max of 10 characters
		if (contactId == null || contactId.length() > 10 ) {
			throw new IllegalArgumentException("Invalid contactId");
		}
		
		// Validate firstName: must not be null and max of 10 characters
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		
		// Validate lastName: must not be null and max of 10 characters
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		
		// Validate phone: must not be null and must be exactly 10 digits
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		// Validate address: must not be null and max 30 characters
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}

		// Assign validated values to fields
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;

	}

	// Getters to retrieve contact information
	public String getContactId() {
		return contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	// Setters to update modifiable fields with validation
	
	// Update firstName with null and length check
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		this.firstName = firstName;
	}
	
	// Update lastName with null and length check
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		this.lastName = lastName;
	}
	
	// Update phone number with digit and length check
	public void setPhone(String phone) {
		if (phone == null || !phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phone = phone;
	}
	
	// Update address with null and length check
	public void setAddress(String address) {
		if (address == null || address.length() > 10) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
}
