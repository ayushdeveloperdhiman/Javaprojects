public class Multithreading2 implements Runnable{
    public static void main(String[]args){
        Multithreading2 t1=new Multithreading2();
        Multithreading2 t2=new Multithreading2();
        Thread d1=new Thread(t1);
        Thread d2=new Thread(t2);
        d1.start();
        d2.start();
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch(Exception ignored){

            }
        }
    }
}
