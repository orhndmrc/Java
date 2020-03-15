package March_15th;

public class StringOperations {
    String value;
    public StringOperations(){
        this.value="";
    }
    public StringOperations(String value){
        this.value=value;
    }
    public String returnReversed(){
        String result="";
        for(int i=this.value.length()-1; i>=0;i--){
            result+=this.value.charAt(i);
        }
        return result;
    }
    public String returnCapitalized(){
        //first concat first letter and convert that letter to upper
        String result ="";
        String firstLetter="";// this variable for converting to String
        firstLetter+=this.value.charAt(0); //concat first letter with first char
        //System.out.println(result);
        result+=firstLetter.toUpperCase(); //concat first letter (upper case) and result
        //System.out.println(result);
        String letter="";
        for(int i=1 ; i<this.value.length();i++){
            if(this.value.charAt(i-1)==' '){
                //check previous char if it is space first convert to String using concat and then conver to Upper
                letter+=  this.value.charAt(i);//converting String
                letter+=letter.toUpperCase();//converting upper
                result+=letter; // concat to result
                letter="";//reset for the second word
            }
            else{
                result+=this.value.charAt(i);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "StringOperations{" +
                "value='" + value + '\'' +
                '}';
    }


}
