package ayush;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastNAme("");
        person.setAge(10);
        System.out.println("fullName = " +person.getFullName());
        System.out.println("teen = "+person.isTeen());
        person.setFirstName("Ayush");
        person.setAge(18);
        System.out.println("fullName = "+person.getFullName());
        System.out.println("tenn = "+person.isTeen());
        person.setLastNAme("Dhiman");
        System.out.println("fullNAme = "+person.getFullName());
    }
}
