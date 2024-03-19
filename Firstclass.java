class Employee {
    private int salary;
    private String name;

    public Employee(String myname,int mysalary){
        salary=mysalary;
        name=myname;
    }
   
    void setsalary(int n){
        this.salary = n;
    }

    void setname(String ch){
        name = ch;
    }

    int getsalary(){
        return salary;
    }

    String getname(){
        return name;
    }
}

class cellphone {
    void ring(){
        System.out.println("ringing");
    }
    void vibrate(){
        System.out.println("Vibrating");
    }
    void silent(){
        System.out.println("Phone is on silent");
    }
}

class square{
    int side;
     
    int area(){
        int ar = side*side;
        return ar;
    }
    int perimeter(){
        int per = 4*side;
        return per;
    }

}

public class Firstclass{
    public static void main(String[] args){
        Employee e1 = new Employee("sanchita",68765687);
        Employee e2 = new Employee("shruti",768767565);
        // e1.setname("shruti");
        // e1.setsalary(56000);
        // e2.setname("sanchita");
        // e2.setsalary(87000);
        System.out.println("employee 1 details : \n\t"+e1.getname()+"\n\t"+e1.getsalary());
        System.out.println("employee 2 details : \n\t"+e2.getname()+"\n\t"+e2.getsalary());

        // cellphone mobile = new cellphone();
        // mobile.ring();
        // mobile.vibrate();
        // mobile.silent();
        
        // square a = new square();
        // a.side=25;
        // System.out.println("Area = "+a.area());
        // System.out.println("Perimeter ="+a.perimeter());
        System.out.println(e1.getname()+"\n"+e2.getname());
        System.out.println(e1.getsalary()+"\n"+e2.getsalary());
    }
}