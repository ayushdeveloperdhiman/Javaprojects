import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[]args){
        int[] array={1,2,3,4,5};
        System.out.println("Original array = "+Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = "+Arrays.toString(array));
    }
    public static void reverse(int[] array){
        int temp;
        for(int i=0;i<array.length/2;i++){
            temp=array[i];
            array[i]=array[(array.length-1)-i];
            array[(array.length-1)-i]=temp;
        }
    }
}
