package test;

//❗ Data Clumps: firstName + lastName + email + address gehören zusammen
class Participant {

 private final String firstName;
 private final String lastName;
 private final Address address;
 private final String email;

 public Participant(String firstName, String lastName, Address address, String email) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.address = address;
     this.email = email;
 }

 public String getFirstName() { return firstName; }
 public String getLastName() { return lastName; }
 public Address getAddress() { return address; }
 public String getEmail() { return email; }

 // ❗ Adresse ausgeben → gehört logisch zur Participant Klasse
 public void printAddress() {
     System.out.println(firstName + " " + lastName);
     System.out.println(address.getStreet());
     System.out.println(address.getZip() + " " + address.getCity());
 }
}