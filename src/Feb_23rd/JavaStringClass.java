package Feb_23rd;

public class JavaStringClass {
    public static void main(String[] args) {

        passwordCheck("corona");
        System.out.println(passCheck("adbgjggkk"));
    }

    public static void passwordCheck(String password) {
        if (password.length() >= 6) {
            System.out.println("Okay");
        } else {
            System.out.println("Bad password");
        }
    }
        public static String passCheck(String password){
            String result;
            if(password.length()>=6){
                result = "ok";
            }
            else{
                result= "not okay";
            }
            return result;
        }


    }
