package ayush;



public class Person {
    private String firstName;
    private String lastNAme;
    private int age;
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastNAme(){
        return this.lastNAme;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastNAme(String lastName){
        this.lastNAme=lastName;
    }
    public void setAge(int age){
        if(age>=0&&age<=100) {
            this.age = age;
        }else{
            this.age=0;
        }
    }
    public boolean isTeen(){
        if (this.age>12&&this.age<20){
            return true;
        }
        return false;
    }
    public String getFullName(){
        if (this.firstName.isEmpty()&&this.lastNAme.isEmpty()){
            return "";
        }else if (this.lastNAme.isEmpty()){
            return this.firstName;
        }else if(this.firstName.isEmpty()) {
            return this.lastNAme;
        }
        else
            return this.firstName+" "+this.lastNAme;
    }
}