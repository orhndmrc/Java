

import java.awt.image.LookupOp;
import java.util.Scanner;

public class StrinKomutlariOdev1 {
    public static void main(String[] args) {
        /*1- Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin
        hepsini küçük ve daha sonra büyük hallerini yazdırınız.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Adınızı ve soyadınızı yazınız: ");
        String name = sc.nextLine();
        String namekucuk = name.toLowerCase();
        int isoyad = name.indexOf(" ");
        String ilkisim = name.substring(0,isoyad);
        String soyisim = name.substring(isoyad+1);
       //boolean dogrumu =  soyisim.contains("E");


        String sonHali = ilkisim.replace(name.charAt(0), namekucuk.charAt(0))+" "+soyisim.replace(name.charAt(isoyad+1), namekucuk.charAt(isoyad+1));
        System.out.println(sonHali);
        if(soyisim.contains("E")){
            System.out.println("soy isim de E vardir");
        }
        else{
            System.out.println("no");
        }
     //LOOP
        //METHODS
        //OOP

    }
    }