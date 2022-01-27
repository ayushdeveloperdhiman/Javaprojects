public class Sorting {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,5};
        Sorting obj=new Sorting();
        obj.bubbleSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void bubbleSort(int[] arr){
        for(int i=1;i< arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
