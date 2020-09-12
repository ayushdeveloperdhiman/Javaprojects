package ayush;

public class Main {

    public static void main(String[] args) {
        VipCustomer ayush = new VipCustomer();
        System.out.println(ayush.getName());
        System.out.println(ayush.getCreditLimit());
        System.out.println(ayush.getEmailAddress());

        VipCustomer aditya = new VipCustomer("Aditya", "aditya@gmail.com");
        System.out.println(aditya.getName());
        System.out.println(aditya.getCreditLimit());
        System.out.println(aditya.getEmailAddress());

        VipCustomer ashish=new VipCustomer("Ashish",100,"Ashish@gmail.com");
        System.out.println(ashish.getName());
        System.out.println(ashish.getCreditLimit());
        System.out.println(ashish.getEmailAddress());

    }
}
