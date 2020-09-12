package ayush;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            double area = width * height;
            return ((int) (Math.ceil((area / areaPerBucket)) - extraBuckets));
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width > 0 && height > 0 && areaPerBucket > 0) {
            double area = width * height;
            return ((int)(Math.ceil(area/areaPerBucket)));
        }
        return -1;
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area>0&&areaPerBucket>0){
            return((int)(Math.ceil(area/areaPerBucket)));
        }
        return -1;
    }
}
