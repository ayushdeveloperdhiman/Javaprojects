public class Main {
    public static void main(String[] args) {
        ITelephone ayushPhone=new DeskPhone(1230);
        ayushPhone.powerOn();
        ayushPhone.callPhone(1230);
        ayushPhone.answer();

        ayushPhone=new mobilePhone(12301);
        ayushPhone.powerOn();
        ayushPhone.callPhone(12301);
        ayushPhone.answer();
    }
}
