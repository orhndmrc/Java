package Enums;

public class Skills {
    enum skillset{
        JAVA,
        SELENIUM,
        SQL,
    }

    public static void main(String[] args) {

        skillset list = skillset.JAVA;
        switch(list){
            case JAVA:
                System.out.println("500 points for the interview");
                break;
            case SELENIUM:
                System.out.println("600 points for the interview");
                break;
            case SQL:
                System.out.println("700 points for the interview");
                break;
        }
    }
}
