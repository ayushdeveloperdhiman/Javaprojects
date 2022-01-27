public class FourDArray {
    public static void main(String[] args) {
        int[][][][] arr={{{{12,5412},{254,844,541,},{185}},{{125,221,551}}}};
        System.out.println("Using simple for loop: ");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k< arr[i][j].length;k++){
                    for(int l=0;l< arr[i][j][k].length;l++){
                        System.out.print(arr[i][j][k][l]+"\t");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("Using for each:");
        for(int[][][] i:arr){
            for(int[][] j:i){
                for(int[] k:j){
                    for(int l:k){
                        System.out.print(l+"\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}
