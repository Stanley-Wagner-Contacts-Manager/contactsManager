package ContactManagerApp;

import java.io.IOException;


public class ContactMain {

    public static void main(String[] args) throws IOException {
        contactsApp();
    }

    public static void contactsApp() throws IOException{
        System.out.println("Contacts List Manager 1.0\n");
        System.out.println("Please make a selection from the list below:");
        System.out.println("1: Add: Add a new contact to the contact list");
        System.out.println("2: All: Show all contacts currently in your contacts list");
        System.out.println("3: Search: Search for a specific contact by name");
        System.out.println("4: Delete: Delete a specific contact from your contacts list");
        System.out.println("5: Exit: Exit the contacts list manager app\n");

        String userInput = Input.getString();
        userInput = userInput.toLowerCase();
        if(userInput.equals("add") || userInput.equals("1")){
            System.out.println("Enter new contact name:");
            String name = Input.getString();
            System.out.println("Enter phone number for " + name);
            String number = Input.getString();
            Contact toAdd = new Contact(name, number);
            toAdd.AddContact();
            contactsApp();
        } else if (userInput.equals("all") || userInput.equals("2")){
            Contact.showContacts();
            contactsApp();
        } else if (userInput.equals("search") || userInput.equals("3")){
            System.out.println("Enter the FULL NAME of the contact you wish to search for");
            String name = Input.getString();
            name = name.toLowerCase();
            Contact.searchContacts(name);
            contactsApp();
        } else if (userInput.equals("delete") || userInput.equals("4")){
            Contact.showContacts();
            System.out.println("Enter the FULL NAME contact you wish to delete");
            String name = Input.getString();
            name = name.toLowerCase();
            Contact.deleteContact(name);
            System.out.println("You deleted: " + name);
            Contact.showContacts();
            contactsApp();
        } else if (userInput.equals("exit") || userInput.equals("5")){
            System.out.println("Thanks for using the Contacts List Manager");
        } else {
            System.out.println(userInput + " is not a valid input. Please try again.");
            contactsApp();
        }

    }


}
