import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("7018515995");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name=scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number=scanner.nextLine();
        Contacts newContact=Contacts.createContact(name,number);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = "+name+" number ="+number);
            return;
        }
        System.out.println("Cannot add, "+name+" already on file.");
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name=scanner.nextLine();
        Contacts existingContactRecord=mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName=scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String contact=scanner.nextLine();
        Contacts newContact=new Contacts(newName,contact);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully updated record.");
        }else{
            System.out.println("Error updating record.");
        }
    }
    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name=scanner.nextLine();
        Contacts existingContactRecord=mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted.");
        }else{
            System.out.println("Error deleting contact.");
        }
    }
    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name :"+existingContactRecord.getName()+" phone number "+existingContactRecord.getPhoneNumber()+" is on the list");
    }
    private static void printActions() {
        System.out.println("\nAvailable actions\nPress");
        System.out.println("0 - To shutdown\n1 - To print contacts\n2 - To add new contact\n3 - To update an existing contact\n4 - To remove an existing contact\n5 - Query if an contact exists\n6 - To print list of available actions");
        System.out.println("Choose your action: ");
    }
}
