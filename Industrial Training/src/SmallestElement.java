public class SmallestElement {
    public static void main(String[] args) {
        int[] arr={25,24,1,54,57};
        int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        System.out.println("Smallest element is : "+min);
    }
}
