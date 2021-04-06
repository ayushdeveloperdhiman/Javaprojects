public class merge {
    public static void main(String[]args){
        int arr1[]={1,2,3};
        int arr2[]={4,5,6,7,8};
        int arr3[]=new int[arr1.length+arr2.length];
        int i;
        for(i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];
        }

        for(int j=0;j<arr2.length;j++)
        {
            arr3[i] = arr2[j];
            i++;
        }
        for(int k=0;k<arr3.length;k++){
            System.out.println("Elements in array :"+arr3[k]);
        }
    }
}
