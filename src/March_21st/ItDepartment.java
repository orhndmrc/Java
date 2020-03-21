package March_21st;

public class ItDepartment extends Department {
    protected String Skill;
    public ItDepartment(String employeeName, String employeeId, String position, int salary, String Skill){
        super(employeeName,  employeeId,  position,  salary);
        this.Skill=Skill;
    }
    public String addSkill(String newSkill){
        this. Skill=newSkill;
        return   this. Skill;
    }


    @Override
    public String toString() {
        return "ItDepartment{" +
                "Skill='" + Skill + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
