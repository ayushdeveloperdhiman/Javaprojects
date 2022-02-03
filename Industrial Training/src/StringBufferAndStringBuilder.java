public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        StringBuffer stringBuffer=new StringBuffer("Java");
        System.out.println(stringBuffer.append("Welcome"));
        for(int i=0;i<1000;i++){
            stringBuffer.append("point");
        }
        System.out.println("Time taken by StringBuffer "+(System.currentTimeMillis()-startTime)+" ms");
        startTime=System.currentTimeMillis();
        StringBuilder stringBuilder=new StringBuilder("Java");
        System.out.println(stringBuilder.append("Welcome"));
        for(int i=0;i<1000;i++){
            stringBuffer.append("point");
        }
        System.out.println("Time taken by StringBuilder "+(System.currentTimeMillis()-startTime)+" ms");

    }
}
