public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] arr = {{{1,2,3,4},{5,6,7}},{{8,9},{10}}};
        System.out.println("Using for each");
        for (int[][] i : arr) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.print(k + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("Using simple for");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
