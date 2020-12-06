import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    
    ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacts contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean removeContact(Contacts contact){
        if(findContact(contact)<0){
            System.out.println(contact.getName()+" was not found.");
            return false;
        }
        myContacts.remove(findContact(contact));
        System.out.println(contact.getName()+", was deleted.");
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        if (findContact(oldContact) < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }else if(findContact(newContact.getName())!=-1) {
            System.out.println("Contact with the name "+newContact.getName()+" already exists.\nUpdate was not successful");
            return false;
        }
            myContacts.set(findContact(oldContact), newContact);
            System.out.println(oldContact.getName() + " ,was replaced with " + newContact.getName());
            return true;
    }

    private int findContact(Contacts contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacts contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public String queryContact(Contacts contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
    public Contacts queryContact(String name){
        int position=findContact(name);
        if(position>=0){
            return myContacts.get(position);
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contacts");
        for(int i=0;i<myContacts.size();i++){
            System.out.println((i+1)+". "+myContacts.get(i).getName()+"->"+myContacts.get(i).getPhoneNumber());
        }
    }
}
