import java.util.Arrays;

class Question2_10 {

    public static void main(String[] args) {
        int[] originalArray={1,0,1,0,0,1,1};
        int[] rearrangedArray=new int[originalArray.length];
        int count=0;
        for(int i=0;i< originalArray.length;i++){
            if(originalArray[i] %2 ==0){
                rearrangedArray[count] = originalArray[i];
                count++;
            }
        }
        for(int i=0;i<originalArray.length;i++){
            if(originalArray[i] %2 !=0 ){
                rearrangedArray[count] = originalArray[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(rearrangedArray));
    }
}