import java.util.ArrayList;

class IntClass{
    private int IntValue;
    public IntClass(int IntValue){
        this.IntValue=IntValue;
    }
    public int getIntValue(){
        return IntValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] StrArray = new String[10];
        int[] IntArray = new int[10];

        ArrayList<String> StrArrayList=new ArrayList<>();
        StrArrayList.add("Ayush");

        //ArrayList<int> i=new ArrayList<int>();

        ArrayList<IntClass> IntClassArrayList= new ArrayList<>();
        IntClassArrayList.add(new IntClass(10));
        IntClassArrayList.add(new IntClass(20));

        System.out.println(IntClassArrayList.get(0).getIntValue());
        System.out.println(IntClassArrayList.get(1).getIntValue());

        ArrayList<Integer> IntArrayList=new ArrayList<>();
        for(int i=0;i<10;i++) {
            IntArrayList.add(Integer.valueOf(i));
        }
        for (int i=0;i<10;i++){
            System.out.println("value "+(i+1)+" --> "+IntArrayList.get(i).intValue());
        }

        Integer myIntValue=54;//Integer.valueOf(54)
        int i=myIntValue;//myIntValue.intValue 

        ArrayList<Double> dblArrayList=new ArrayList<>();
        for(double d=0.0;d<=10.0;d+=0.5){
            dblArrayList.add(d);
        }
        for(int d=0;d<dblArrayList.size();d++){
            //double db=dblArrayList.get(d).doubleValue();
            System.out.println(dblArrayList.get(d));
        }

    }
}