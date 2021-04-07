public class nearestPrimeNumber {
    public static void main(String[] args) {
   int arr[]={55,-6,2,28,2,89,59,32,99,46,68};
   int i,j,k,l,m,n;
   for(i=0;i<arr.length;i++){
       if(arr[i]<=2){
           arr[i]=2;
       }
       else{
           for(j=2;j<arr[i];j++){
               if(arr[i]%j==0){

                   break;
               }
               if(j==arr[i]){
                   continue;
               }
               for(k=arr[i]-1;k>=2;k--){
                   for(m=2;m<k;m++){
                       if(k%m==0){
                           break;
                       }
                   }
                   if(m==k){
                       break;
                   }
               }
               for(l=arr[i];l<=100;l++){
                   for(n=2;n<l;n++){
                       if(l%n==0){
                           break;
                       }
                   }
                   if(n==l){
                       break;
                   }
               }
               int d1=arr[i]-k;
               int d2=l-arr[i];
               if(d1<=d2){
                   arr[i]=arr[i]-d1;
               }
               else{
                   arr[i]=arr[i]+d2;
               }
           }
       }

   }
        for(int h=0;h<arr.length;h++){
            System.out.println(arr[h]+"");
        }
    }
}
