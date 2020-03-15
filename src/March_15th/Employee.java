package March_15th;

public class Employee {
    String id;
    String name;
    String department;
    int salary;
    String contract;
    public Employee(){
        this.id="A12345";
        this.name="Orhan";
        this.department="QA";
        this.salary=75000;
        this.contract="Yearly";
    }
    public Employee( String id,   String name, String department,  int salary,  String contract){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.contract=contract;

    }
    public void WeeklyPayment(){
        double weekly= this.salary/52;
        System.out.println(weekly);
    }
    public void BiWeeklyPayment(){
       double biweekly= this.salary/26;
        System.out.println(biweekly);
    }
    public void EmployeeInfo(){
        System.out.println(id+" "+name +" "+department +" "+salary+" "+ contract);
    }
}
