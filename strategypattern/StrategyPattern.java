package strategypattern;
import strategypattern.auth.*;
import strategypattern.entity.Employee;
import strategypattern.entity.Manager;

public class StrategyPattern {
    
    public static void main(String[] args) {
        

        Employee Alice = new Employee(new RoomAuth(),"1");
        System.out.println("Alice:"+Alice.performAuth().toString());
        Employee Bob = new Employee("2");
        System.out.println("Bob:"+Bob.performAuth().toString());
        Employee Chirs = new Manager("3");
        System.out.println("Chirs:"+Chirs.performAuth().toString());
        Employee Dora = new Manager("4");
        System.out.println("PreDora:"+Dora.performAuth().toString());
        Dora.setAuthentication(new AllAuth());
        System.out.println("PostDora:"+Dora.performAuth().toString());
    }
}
