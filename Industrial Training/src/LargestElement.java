public class LargestElement {
    public static void main(String[] args) {
        int[] a={25,10,50,80,42};
        System.out.println("Largest element : "+largest(a));
    }
    public static int largest(int[] arr){
        int l=arr[0];
        for(int i=1;i<arr.length;i++){
            if(l<arr[i]){
                l=arr[i];
            }
        }
        return l;
    }
}
