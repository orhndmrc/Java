package March_18th;

public class Interview {
    private String name;
    private int score;
    private String decision;
    private int java;
    private int SQL;
    private int SoftSkills;
    public Interview(String name, int java,int SQL, int SoftSkills ){
        this.name=name;
        this.score=0;
        this.decision="";
        this.java=java;
        this.SQL=SQL;
        this.SoftSkills=SoftSkills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getSQL() {
        return SQL;
    }

    public void setSQL(int SQL) {
        this.SQL = SQL;
    }

    public int getSoftSkills() {
        return SoftSkills;
    }

    public void setSoftSkills(int softSkills) {
        this.SoftSkills = softSkills;
    }
public int ScoreCalculation(){
        this.score=this.java+this.SQL+  this.SoftSkills;
    System.out.println("The score is "+this.score);
    return this.score;
}
public void ReturnDecision(){
        if(this.score>=1000){
            System.out.println("You pass the interview");
        }
        else if(this.score<1000 && this.score>=500){
            System.out.println("You have a second chance");
        }
        else{
            System.out.println("Failure");
        }
}
    @Override
    public String toString() {
        return "Interview{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", decision='" + decision + '\'' +
                ", java=" + java +
                ", SQL=" + SQL +
                ", SoftSkills=" + SoftSkills +
                '}';
    }
}
