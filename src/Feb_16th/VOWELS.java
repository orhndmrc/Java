package Feb_16th;
import java.util.Scanner;
public class VOWELS {
    public static void main(String[] args) {
        /*length( ) -->This is a numerical returning method that gives the length of the string.  It returns an integer value.
Example:
 String city = "Fulton";
 int citylength = city.length();     //stores the length of city into an int
 System.out.println(citylength);   //prints the length of the string which is 6
 */
        /* charAt(n)  This is a value returning method. The argument states which character to return. The subscripting of the locations of the characters starts with zero.
Example:
String holiday="Thanksgiving";
System.out.println(holiday.charAt(4));    //prints out a 'k'

Example:
String puppy ="Wally";
System.out.println(puppy.charAt(0));    //prints out a 'W'
*/

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = x.nextLine();
        int i =0;
        while(i<a.length()){
if(a.charAt(i)=='i'||a.charAt(i)=='a'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='e'){
    System.out.print(a.charAt(i));
}
else{

}
i++;
        }

    }
}
