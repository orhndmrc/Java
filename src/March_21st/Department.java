package March_21st;

public class Department {
    protected String employeeName;
    protected String employeeId;
    protected String position;
    protected int salary;

    public Department(String employeeName, String employeeId, String position, int salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void changePosition (String position){
        this.position=position;
    }
    public int riseSalary (int salary){
        this.salary=salary;
        return this.salary;
    }
}
