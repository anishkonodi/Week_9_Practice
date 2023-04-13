
//6. Address Book: Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.
import java.util.*;

class AddressBook {
  Scanner s = new Scanner(System.in);
  HashMap<String,Long> contact = new HashMap<String,Long>();

  public void addContact() {
    System.out.println("enter name");
    String name = s.next();
    System.out.println("Enter phone number");
    long phoneNum = s.nextLong();
    // System.out.println("Enter the address");
    // String address = s.next();
    contact.put(phoneNum,name);
  }

  public void listOfContacts() {
    for (AddressBook person : contact) {
      System.out.println(person.name + "  " + person.phoneNum);
    }
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    AddressBook obj = new AddressBook();
    System.out.println("Enter the choice");
    System.out.println("1, Add Contacts");
    System.out.println("2, List of contacts");
    int choice = s.nextInt();
    switch (choice) {
      case 1: {
        obj.addContact();
      }
      case 2: {
        obj.listOfContacts();
      }
    }
  }
}