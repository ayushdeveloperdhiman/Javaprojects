import java.util.Properties;

public class GetPropertiesDemo {
    public static void main(String[] args) {
        Properties x = System.getProperties();
        x.list(System.out);
    }
}
