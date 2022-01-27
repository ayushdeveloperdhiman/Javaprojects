public class Main {
    public static void main(String[] args) throws InterruptedException {
        Test1 t1 = new Test1();
        Test1 t2=new Test1();
        t1.start();
        t2.start();
        synchronized (t2) {
            t2.wait(10000);
            System.out.println(t1+" waiting");
        }
    }
}


class Test1 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(3000);
            }
        } catch (Exception e) {

        }
    }

}

