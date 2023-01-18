package ContactManagerApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class Contact {

    private String name;
    private String phoneNumber;
    private static String contactsDir = "src/ContactManagerApp/";
    private static String contactsFile = "Contacts.txt";
    Path mainDirectory = Paths.get(contactsDir);
    static Path mainFile = Paths.get(contactsDir, contactsFile);

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void AddContact() throws IOException {
        String name = String.format("|%-20s|", this.getName());
        String number = String.format("%-20s|", this.getPhoneNumber());
        Files.write(
                mainFile,
                Arrays.asList(name+number),
                StandardOpenOption.APPEND
        );
    }






}
