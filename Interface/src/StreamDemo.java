public class StreamDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Writing to console");
            int i = 100/0;

        }catch (Exception e){
            System.err.println("Arithmetic Exception.");
        }
    }
}
