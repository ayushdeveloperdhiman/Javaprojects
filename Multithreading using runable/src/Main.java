public class Main implements Runnable{
    public static void main(String[] args) throws Exception {
        Main obj = new Main();
        Thread t = new Thread(obj);
        t.start();
        synchronized (t){
            t.wait(2000);
            System.out.println(t+" waiting");
        }
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
