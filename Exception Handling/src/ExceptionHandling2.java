public class ExceptionHandling2 {
    public static void main(String[] args) {
        try{
            int a=10,b=0,c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            int arr[]= new int[5];
            arr[5]=17;
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
