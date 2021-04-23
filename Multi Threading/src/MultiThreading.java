public class MultiThreading extends Thread{
    public static void main(String[]args){
        MultiThreading t1=new MultiThreading();
        MultiThreading t2=new MultiThreading();
        t1.start();
        t2.start();
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
