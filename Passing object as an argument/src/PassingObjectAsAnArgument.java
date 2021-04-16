public class PassingObjectAsAnArgument {
    public static void main(String[] args) {
        time t1 = new time();
        time t2 = new time();
        new time();
        time t3;
        t1.fun(2, 40, 40);
        t2.fun(3, 40, 40);
        t3 = t1.sum(t2);
        t3.show();
    }
}

class time {
    private int hr, min, sec;

    void fun(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }

    void show() {

        System.out.println(hr + "hr " + min + " min " + sec + "sec");
    }

    time sum(time obj) {
        time t = new time();
        t.hr = hr + obj.hr;
        t.min = min + obj.min;
        t.sec = sec + obj.sec;
        if(t.sec>60){
            t.min= t.min+(t.sec/60);
            t.sec=t.sec%60;
        }
        if (t.min > 60) {
            t.hr = t.hr + (t.min / 60);
            t.min = t.min % 60;
        }
        return t;
    }
}

