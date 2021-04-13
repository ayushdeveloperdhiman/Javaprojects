public class ipAddress {
    public static void main(String[] args) {
        System.out.println(checkIP("300.300.300.210"));
        System.out.println(checkIP("0.0.0.0"));
        System.out.println(checkIP("9.5.180.210"));
        System.out.println(checkIP("0.9.6.235"));
        System.out.println(checkIP("9.6.3"));
        System.out.println(checkIP("9.6.285.10"));
    }
    static boolean checkIP(String str){
        String arr[]=str.split("\\.");
        if(arr.length<4||arr.length>4){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            int x=Integer.parseInt(arr[i]);
            if(x>=0&&x<=235){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
