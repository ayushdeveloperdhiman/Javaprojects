class MultilevelInheritance{
    public static void main(String[] args) {
        A3 obj=new A3();
        obj.methodA1();
        obj.methodA2();
        obj.methodA3();
    }
}
class A1{
    void methodA1(){
        System.out.println("Inside method 1 of A1 class");
    }
}
class A2 extends A1{
    void methodA2(){
        System.out.println("Inside method 2 of A2 class");
    }
}
class A3 extends A2{
    void methodA3(){
        System.out.println("Inside method 3 of A3 class");
    }
}