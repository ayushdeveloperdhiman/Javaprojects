package exception_handling;


public class MathOperation {
    public static void main(String[] args) throws Exception {
        try {
            int[] arr = new int[5];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            int sum=0;
            int average=0;
            for(int i=0;i<arr.length;i++){
                sum += arr[i];
            }
            average = sum/arr.length;

            System.out.println("Sum = "+sum);
            System.out.println("Average = "+average);
        }catch (Exception e){
            System.out.println(e.getClass());
        }



    }
}
