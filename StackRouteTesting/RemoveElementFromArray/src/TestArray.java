import org.junit.Assert;

public class TestArray {
    @org.junit.Test
    public void testArray(){
        int[] arr ={25,40,35,75};
        Assert.assertArrayEquals(new int[]{25,35,75},Demo1.removeElement(arr,40));
    }
    @org.junit.Test
    public void testArray1(){
        int[] arr ={0,12,34,45};
        Assert.assertArrayEquals(new int[]{12,34,45},Demo1.removeElement(arr,0));
    }
    @org.junit.Test
    public void testArray2(){
        int[] arr ={50,-10,41,47,62,30};
        Assert.assertArrayEquals(new int[]{50,41,47,62,30},Demo1.removeElement(arr,-10));
    }
    @org.junit.Test
    public void testArray3(){
        int[] arr ={25,40,35,75};
        Assert.assertArrayEquals(new int[]{25,35,75},Demo1.removeElement(arr,40));
    }

    @org.junit.Test
    public void testArray4(){
        int[] arr ={25,40,35,75};
        Assert.assertArrayEquals(null,Demo1.removeElement(arr,65));
    }
}
