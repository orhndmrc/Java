package String;

public class NumberOfWords {
    public static void main(String[] args) {
        System.out.println(countWordsCamelCase("saveChangesInTheEditor"));
    }
    public static int countWordsCamelCase(String var){
        int count=1;
        StringBuilder stringBuilder = new StringBuilder(var);
        for (int i = 0; i < stringBuilder.length() ; i++) {
            if(stringBuilder.codePointAt(i)>=65 && stringBuilder.codePointAt(i)<=92){
                count++;
            }
        }
        return count;
    }
}
