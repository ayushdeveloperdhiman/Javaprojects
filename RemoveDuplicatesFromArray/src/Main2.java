import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        int[] arr={1,1,2,1,3,5,4,1,2};
        removeDuplicates(arr);
    }
    public static void removeDuplicates(int a[]){
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i< a.length;i++){
            set.add(a[i]);
        }
        System.out.println(set);
    }
}
