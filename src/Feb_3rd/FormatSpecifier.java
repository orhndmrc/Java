package Feb_3rd;

public class FormatSpecifier {
    public static void main(String args[]){
        /*float myNumber = 14.897556f;
        System.out.format("This is string %.3f",myNumber);*/
String java = "Java is fun";
float percentage = 78.98f;
double percentage2 = 78.98000;
System.out.format("Do you think %s? \n",java);
        System.out.format("Yes %f of the people think it is fun \n",percentage);
        System.out.format("Yes %.2f of the people think it is fun ",percentage);
    }
}
