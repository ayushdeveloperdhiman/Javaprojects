import java.util.Scanner;
import java.util.Vector;

public class Operations {

    static void input(Vector<Students> v) {
        int r,m1,m2,m3;
        String n;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Roll Number:");
            r = s.nextInt();
            System.out.println("Enter Name :");
            n = s.next();
            System.out.println("Enter Marks 1 :");
            m1=s.nextInt();
            System.out.println("Enter Marks 2 :");
            m2=s.nextInt();
            System.out.println("Enter Marks 3 :");
            m3=s.nextInt();
            Students obj = new Students();
            obj.setRoll(r);
            obj.setName(n);
            obj.setMarks1(m1);
            obj.setMarks2(m2);
            obj.setMarks3(m3);
            v.add(obj);
        }
    }
    static void output(Vector<Students> v){
        for (int i=0;i<v.size();i++){
            Students obj=v.get(i);
            double avg=(double) ((obj.getMarks1()+obj.getMarks2()+obj.getMarks3())/3);
            double percentage=(double) ((obj.getMarks1()+obj.getMarks2()+obj.getMarks3()/30)*100);
            System.out.println(obj.getRoll()+"\t"+obj.getName()+"\t"+"Marks : "+obj.getMarks1()+"\t"+obj.getMarks2()+"\t"+ obj.getMarks3()+"\t"+"Average : "+avg+" Percentage : "+percentage);

        }
    }
}
