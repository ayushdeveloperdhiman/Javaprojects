import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr= {2,5,1,8,9};
        System.out.println(Arrays.toString(removeElement(arr,9)));
    }
    public static int[] removeElement(int[] arr,int element){
        int[] newArray = new int[arr.length - 1];
        int j=0;
        for(int i=0;i< arr.length;i++){
                if(arr[i] != element ){
                    if(j>= newArray.length){
                        return null;
                    }
                    newArray[j] = arr[i];
                    j++;
                }else {
                    j=i;
                }
        }
        return newArray;

    }
}
